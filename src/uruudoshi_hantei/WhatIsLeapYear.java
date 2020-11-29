package uruudoshi_hantei;

public class WhatIsLeapYear {

    public static void main(String[] args) {
        int year = 2020; //判定したい年数を設定

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if ((year % 100) == 0) {
                isLeapYear = ((year % 400) == 0);
            } else {
                isLeapYear = true;
            }
        }
        System.out.println(year + "年はうるう年" + (isLeapYear ? "です。" : "ではない。"));

    }

}
