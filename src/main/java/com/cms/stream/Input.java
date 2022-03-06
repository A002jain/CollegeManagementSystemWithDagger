package com.cms.stream;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Scanner;

@Singleton
public class Input {

    @Inject
    public Input(){}

    private static final Scanner scanner=new Scanner(System.in);

    /**
     * method should static but not used because of testing singleton Input instance by dagger
     * instance of Input in Menu Should same as of CMSService
     * @param string
     * @return
     */

    public int getInt(String string){
        System.out.println(string);
        return scanner.nextInt(); }

    public String getString(String string){
        System.out.println(string);
        return scanner.next();
    }
}
