package com.experiment08;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;

public class IOTest {
    public static void main(String[] args) throws IOException{
        String fileName = "C:/example/from.txt";

        System.out.println("----- 创建文件 ------");
        // createFile(fileName);

        System.out.println("-----  将字符串写入文件 -------");
        // \r\n在txt文本中换行
        String str =
                "白日依山尽\r\n" +
                        "黄河入海流\r\n" +
                        "欲穷千里目\r\n" +
                        "更上一层楼\r\n";
        // writeToFile(fileName, str);
        writeToFile2(fileName, str);

        System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
        String toFile = "C:/example/to.txt";
        // copyByIO(fileName, toFile);

        System.out.println("--------- 基于NIO实现文件的复制 ----------");
        String toFile2 = "C:/example/nio/to.txt";
        // copyByNIO(fileName, toFile2);

        System.out.println("---------- 删除指定文件 -------------");
        // deleteFile(toFile);

        System.out.println("---------- 遍历指定目录文件 -------------");
        String dir = "C:/example";
        // walkDirectories(dir);
    }

    /**
     * 基于Path/Files实现
     * 将传入的文件绝对路径字符串转path
     * 判断path不存在，则先创建目录，创建文件
     * 文件存在，忽略操作
     *
     * @param fileName
     */
    private static void createFile(String fileName) throws IOException {
        Path path = Path.of(fileName);
        if(Files.exists(path) == false) {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
            System.out.println("文件创建成功！文件位置：" + fileName);
        } else {
            System.out.println("文件已存在");
        }
    }

    /**
     * 注意，传入的fileName为文件绝对路径，必须确保文件所在目录已经存在，才能通过FileOutputStream创建
     * 将字符串转字节数组，基于FileOutputStream直接写入
     *
     * @param fileName
     * @param content
     */
    private static void writeToFile(String fileName, String content) throws FileNotFoundException {
        byte[] buffer = content.getBytes();
        try(FileOutputStream out = new FileOutputStream(fileName)){
            out.write(buffer);
            System.out.println("数据写入成功");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 将传入的文件绝对路径字符串转path，通过Files创建文件所在目录
     * 将字符串，基于Files工具类直接写入。写入方法，文件不存在创建并写入，存在则覆盖写入
     *
     * @param fileName
     * @param content
     */
    private static void writeToFile2(String fileName, String content) throws IOException {
        Path p = Path.of(fileName);
        if(Files.exists(p) == false ) {
            Files.createDirectories(p.getParent());
        }
        Files.write(p, content.getBytes());
    }

    /**
     * 基于基本IO，以及字节数组缓冲区，复制文件
     * 打印显示循环读写循环次数
     * 正确关闭资源
     *
     * @param sourceFile
     * @param targetFile
     */
    private static void copyByIO(String sourceFile, String targetFile) throws IOException{
        try(InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[4];
            int length = 0;
            int count = 0;
            while ((length = in.read(buffer) )!= -1){
                out.write(buffer,0,length);
                count++;
            }
        }
    }

    /**
     * 基于NIO，实现文件的复制
     * 注意，判断目标为字符串，需要转为path并创建相应目录
     *
     * @param sourceFile
     * @param targetFile
     */
    private static void copyByNIO(String sourceFile, String targetFile) {
        Path source = Path.of(sourceFile);
        Path target = Path.of(targetFile);
        try {
            Files.createDirectories(target.getParent());
            Files.createFile(target);
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     *
     * @param fileName
     */
    private static void deleteFile(String fileName) throws IOException{
        Path p = Path.of(fileName);
        Files.deleteIfExists(p);
    }

    /**
     * 遍历打印指定目录下全部目录/文件名称
     * 尝试改变正逆序操作方法
     *
     * @param dir
     */
    private static void walkDirectories(String dir) throws IOException{
        Path p = Path.of(dir);
        Files.walk(p)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
