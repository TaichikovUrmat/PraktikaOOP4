// TODO
//       Company деген класс тузунуз, полелери (company name,
//        country, year of foundation, founder, groups[]).
//        Group деген класс тузунуз, полелери(group name, start date,
//        mentor), ушул класс Company класска поле катары массив болуп
//        барат.
//        Person деген класс тузунуз, полелери(first name, last name, date
//        of birth) ушул класс Company жана Group класстарга поле
//        катары барат.
//        main ден класстардын объектин тузуп полелерине маани
//        бериниз жана консольго чыгарыныз

public class Company {
    String ComNema;
    String strana;
    String got;
    String osnovanie;
    String ocnovatel;
    String groups;

    public Company(String comNema, String strana, String got, String osnovanie, String ocnovatel, String groups) {
        ComNema = comNema;
        this.strana = strana;
        this.got = got;
        this.osnovanie = osnovanie;
        this.ocnovatel = ocnovatel;
        this.groups = groups;
    }
}





