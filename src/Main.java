import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("101","Кыргызстат","2023",
                "Paeksoft","Java-12","java,js,HTM");

        System.out.println(STR."""
                \{company.ComNema}
                \{company.strana}
                \{company.got}
                \{company.ocnovatel}
                \{company.osnovanie}
                \{company.groups}

                """);
    }
}