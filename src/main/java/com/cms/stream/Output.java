package com.cms.stream;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Output {

     @Inject
     public Output(){

     }

     public void print(Object string){ System.out.println(string); }
}
