package com.juaracoding.posttestday30;

import java.util.Arrays;

//soal 3
public class TrailerManipulation {
    public static void main(String[] args){
        String input = ":T1:202112SOAL3\n"
                + ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT\n"
                + ":T1:202111SOAL3\n"
                + ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT\n"
                + ":T1:202110SOAL3\n"
                + ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT\n";

        String output = rearrangeTageT2(input);
        System.out.println(output);
    }
    public static String rearrangeTageT2(String data) {
        StringBuilder result = new StringBuilder();
        System.out.println("data: " + data);
        String[] parts = data.split(":T1:");
        System.out.println("parts: " + Arrays.toString(parts));
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty()) {
                continue; // skip empty parts
            }
            if (i > 0) {
                result.append(":T1:");
            }
            String[] trailers = parts[i].split("\n");
            String trailer1 = "";
            String trailer2 = "";
            String trailer3 = "";
            String trailer4 = "";
            String trailer5 = "";
            if (trailers.length >= 5) {
                trailer1 = trailers[1].substring(18);
                trailer2 = trailers[2].substring(0, 18);
                trailer3 = trailers[2].substring(18) + trailers[3].substring(0, 9);
                trailer4 = trailers[3].substring(9) + trailers[4].substring(0, 9);
                trailer5 = trailers[4].substring(9, Math.min(trailers[4].length(), 18));
            }
            result.append("T2:").append(trailer1).append(" ").append(trailer2)
                    .append(" ").append(trailer3).append(" ").append(trailer4)
                    .append(" ").append(trailer5).append(":T1:");
            result.append(parts[i].substring(0, 18));
        }
        return result.toString();
    }
    }

