package com.juaracoding.posttestday30;
//soal 3
public class TrailerManipulation {


    public static void main(String[] args) {
        String[] input = {
                ":T1:202112SOAL3",
                ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT",
        };

        String[] trailers = input[1].split(" ");
        String[] newTrailers = {
                trailers[2], trailers[3], trailers[4], trailers[0], trailers[1]
        };
        input[1] = ":T2:" + String.join(" ", newTrailers);

        String[] expected = {
                ":T1:202112SOAL3",
                ":T2:CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DTSOAL3/2112/AB000000011 OD:0001234500",
        };

        System.out.println(input[0].equals(expected[0]));
        System.out.println(input[1].equals(expected[1]));

        // Change the position of the Tag :T2: Trailer 1 and 2 --> becomes Trailer 4 and 5
        String[] trailers2 = input[1].split(" ");
        String[] newTrailers2 = {
                trailers2[2], trailers2[3], trailers2[4], trailers2[0], trailers2[1]
        };
        input[1] = ":T2:" + String.join(" ", newTrailers2);

        String[] expected2 = {
                ":T1:202112SOAL3",
                ":T2:ABCDE12345 XAS SKILL TEST ESSAY .DTSOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003",
        };

        System.out.println(input[0].equals(expected2[0]));
        System.out.println(input[1].equals(expected2[1]));

    }
}
