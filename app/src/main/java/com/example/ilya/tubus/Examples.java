package com.example.ilya.tubus;

/**
 * Created by ilya on 13.03.2018.
 */

public class Examples {
    public Expression[] expression;

    Examples() {
        expression = new Expression[]{
                new Expression("2*5 ? 6*1",
                        0),//1
                new Expression("8*3 ? 7*4",
                        0),//2
                new Expression("0*7 ? 9*0",
                        0),//3
                new Expression("10*7 ? 8*9",
                        0),//2
                new Expression("5*4 ? 345*0",
                        0),//1
                new Expression("4*4 ? 2*10",
                        0),//2?
                new Expression("5*8 ? 8*5",
                        0),//3
                new Expression("2*6 ? 2*8",
                        0),//2
                new Expression("8*4 ? 5*3",
                        0),//1
                new Expression("6*4 ? 9*3",
                        0),//2
                new Expression("10*3 ? 6*5",
                        0),//3
                new Expression("6*6 ? 7*7",
                        0),//2
                new Expression("9*9 ? 8*6",
                        0),//1
                new Expression("8*6 ? 8*6",
                        0),//3
                new Expression("8*6 ? 9*5",
                        0),//1
                new Expression("3*7 ? 5*5",
                        0),//2
                new Expression("6*9 ? 5*7",
                        0),//1
                new Expression("10*2 ? 5*4",
                        0),//3
                new Expression("5*9 ? 6*7",
                        0),//1
                new Expression("9*6 ? 8*8",
                        0)//2
        };
        expression[0].directions[0] = new Expression("", 1);
        expression[0].directions[1] = new Expression("", 0);
        expression[0].directions[2] = new Expression("", 0);

        expression[1].directions[0] = new Expression("", 0);
        expression[1].directions[1] = new Expression("", 1);
        expression[1].directions[2] = new Expression("", 0);

        expression[2].directions[0] = new Expression("", 0);
        expression[2].directions[1] = new Expression("", 0);
        expression[2].directions[2] = new Expression("", 1);

        expression[3].directions[0] = new Expression("", 0);
        expression[3].directions[1] = new Expression("", 1);
        expression[3].directions[2] = new Expression("", 0);

        expression[4].directions[0] = new Expression("", 1);
        expression[4].directions[1] = new Expression("", 0);
        expression[4].directions[2] = new Expression("", 0);

        expression[5].directions[0] = new Expression("", 0);
        expression[5].directions[1] = new Expression("", 1);
        expression[5].directions[2] = new Expression("", 0);

        expression[6].directions[0] = new Expression("", 0);
        expression[6].directions[1] = new Expression("", 0);
        expression[6].directions[2] = new Expression("", 1);

        expression[7].directions[0] = new Expression("", 0);
        expression[7].directions[1] = new Expression("", 1);
        expression[7].directions[2] = new Expression("", 0);

        expression[8].directions[0] = new Expression("", 1);
        expression[8].directions[1] = new Expression("", 0);
        expression[8].directions[2] = new Expression("", 0);

        expression[9].directions[0] = new Expression("", 0);
        expression[9].directions[1] = new Expression("", 1);
        expression[9].directions[2] = new Expression("", 0);

        expression[10].directions[0] = new Expression("", 0);
        expression[10].directions[1] = new Expression("", 0);
        expression[10].directions[2] = new Expression("", 1);

        expression[11].directions[0] = new Expression("", 0);
        expression[11].directions[1] = new Expression("", 1);
        expression[11].directions[2] = new Expression("", 0);

        expression[12].directions[0] = new Expression("", 1);
        expression[12].directions[1] = new Expression("", 0);
        expression[12].directions[2] = new Expression("", 0);

        expression[13].directions[0] = new Expression("", 0);
        expression[13].directions[1] = new Expression("", 0);
        expression[13].directions[2] = new Expression("", 1);

        expression[14].directions[0] = new Expression("", 1);
        expression[14].directions[1] = new Expression("", 0);
        expression[14].directions[2] = new Expression("", 0);

        expression[15].directions[0] = new Expression("", 0);
        expression[15].directions[1] = new Expression("", 1);
        expression[15].directions[2] = new Expression("", 0);

        expression[16].directions[0] = new Expression("", 1);
        expression[16].directions[1] = new Expression("", 0);
        expression[16].directions[2] = new Expression("", 0);

        expression[17].directions[0] = new Expression("", 0);
        expression[17].directions[1] = new Expression("", 0);
        expression[17].directions[2] = new Expression("", 1);

        expression[18].directions[0] = new Expression("", 1);
        expression[18].directions[1] = new Expression("", 0);
        expression[18].directions[2] = new Expression("", 0);

        expression[19].directions[0] = new Expression("", 0);
        expression[19].directions[1] = new Expression("", 1);
        expression[19].directions[2] = new Expression("", 0);


    }
}