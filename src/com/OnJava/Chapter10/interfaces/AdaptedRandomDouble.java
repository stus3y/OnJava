package com.OnJava.Chapter10.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDouble implements RandomDoubles, Readable{
    private int count;

    public AdaptedRandomDouble(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;

        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedRandomDouble(7));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
