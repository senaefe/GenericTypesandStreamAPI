package com.rd;
import java.util.List;
import java.util.Optional;

public class StreamTest {
    public static void main(String[] args) {
        List<String> seasons = List.of("Spring", "Summer", "Autumn", "Winter");

        String Season1 = "Summer";
        findAndPrintSeason(seasons, Season1);  // Çıktı: Summer

        String Season2 = "June";
        findAndPrintSeason(seasons, Season2);  // Çıktı: -1
    }

    public static void findAndPrintSeason(List<String> list, String season) {
        Optional<String> result = list.stream()
                .filter(item -> item.equals(season))
                .findFirst();

        result.ifPresentOrElse(
                resultseason -> System.out.println(resultseason),
                () -> System.out.println(-1)
        );
    }
}
