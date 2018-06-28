package me.jtghawk137.test;

import me.jtghawk137.biocraft.server.util.MathUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSort
{

    private static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args)
    {
        ints.add(100);
        ints.add(200);
        ints.add(400);
        ints.add(300);
        ints.add(500);
        ints.sort(Comparator.comparing(Integer::intValue).reversed());
        System.out.println(MathUtils.sigmoid(3f * 4f));
        System.out.println(ints);
    }
}
