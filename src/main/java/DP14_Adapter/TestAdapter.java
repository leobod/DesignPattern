package DP14_Adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 适配器模式
 *
 * 目的是将A对象通过适配/转换的方式转换成B对象来使用.
 *
 * 因为用户倾向于使用B对象
 *
 */

public class TestAdapter {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("test.txt"); // FileInputStream extends InputStream
            InputStreamReader isr = new InputStreamReader(fis);         // InputStreamReader extends Reader
            BufferedReader br = new BufferedReader(isr);				// BufferedReader extends Reader

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
