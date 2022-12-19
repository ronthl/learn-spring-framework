package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot kiki = new Parrot();
        kiki.setName("Kiki");

        Supplier<Parrot> kikiSupplier = () -> kiki;
        context.registerBean("kiki", Parrot.class, kikiSupplier);

        Parrot riki = new Parrot();
        riki.setName("Riki");

        Supplier<Parrot> rikiSupplier = () -> riki;
        // set parrot Riki as a primary bean.
        context.registerBean("riki", Parrot.class, rikiSupplier, bc -> bc.setPrimary(true));

        // no bean name is specified, Riki is used as a primary bean.
        var rikiBean = context.getBean(Parrot.class);
        System.out.println(rikiBean);

        // specify kiki bean name, Kiki is used.
        var kikiBean = context.getBean("kiki", Parrot.class);
        System.out.println(kikiBean);
    }
}
