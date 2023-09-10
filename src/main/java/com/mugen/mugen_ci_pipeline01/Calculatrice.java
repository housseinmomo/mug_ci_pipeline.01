package com.mugen.mugen_ci_pipeline01;

import java.util.List;
import java.util.Map;

public class Calculatrice {

    public int add(int a, int b) {
        return a+b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int sous(int a, int b) {
        return a-b;
    }

    public double div(int a, int b)  {
        if(b == 0) { return 0; }
        return a/b;
    }
}
