import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrinterViaStream {

      public static void main(String[] args) {
//          List <String> uglyStrings = new ArrayList<>();
          String forList = "123 ,www, 1qaz, 2wsx, 3edcvfr, zzz, yyyrr";
          List <String> uglyStrings = new ArrayList<>();
          uglyStrings.addAll(Arrays.asList(forList.split("\\s*,\\s*")));
          uglyStrings.stream()
                 .filter(s -> !s.matches("\\d.*"))
                 .map (s ->s.toUpperCase())
                 .map (s ->s.substring(0,3))
                 .forEach(s -> System.out.print(s+" "));
          }

}
