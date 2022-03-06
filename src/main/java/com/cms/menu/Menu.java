package com.cms.menu;

import com.cms.exception.CmsException;
import com.cms.service.ICmsService;
import com.cms.stream.Input;
import com.cms.stream.Output;

import javax.inject.Inject;

public class Menu {
    boolean flag;
    private final Input input;
    private final Output output;
    private final ICmsService cmsService;
    private final ICmsService cmsService1;

    @Inject
    public Menu(Input input, Output output, ICmsService cmsService, ICmsService cmsService1){
        this.input = input;
        this.output = output;
        this.cmsService = cmsService;
        this.cmsService1 = cmsService1;
//        System.out.println(test);
    }

    private void mainMenu(){
        int selectCms = 0;
        while (flag) {
            flag = false;
            output.print(" 1->Teacher MS\n 2->Student MS\n 3->Exit");
            selectCms = input.getInt("Enter Your Choice: ");
            switch (selectCms) {
                case 1:
                    cmsService.setFlag(true);
                    break;
                case 2:
                    cmsService.setFlag(false);
                    break;
                case 3:
                    System.exit(0);
                default:
                    output.print("choose between 1 and 2");
                    flag = true;
            }
        }
    }

    private void crudMenu(){

    }

    public void newDisplayMenu() throws CmsException {
        int choice = 0;
        output.print("1->Create\n2->Read\n3->Update\n4->Delete\n5->ListAll\n6->Exit");
        choice = input.getInt("Enter Your Choice: ");
        switch (choice) {
            case 1:
                cmsService.create();
                break;
            case 2:
                cmsService.read();
                break;
            case 3:
                cmsService.update();
                break;
            case 4:
                cmsService.delete();
                break;
            case 5:
                cmsService.listN();
                break;
            case 6:
                flag=true;
                break;
            default:
                output.print("choose between 1 and 6");
        }

    }
    public void displayMenu() throws CmsException {
        int choice = 0;
        int selectCms = 0;
        flag = true;
        while (true) {
            while (flag) {
                flag = false;
                output.print(" 1->Teacher MS\n 2->Student MS\n 3->Exit");
                selectCms = input.getInt("Enter Your Choice: ");
                switch (selectCms) {
                    case 1:
                        cmsService.setFlag(true);
                        break;
                    case 2:
                        cmsService.setFlag(false);
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        output.print("choose between 1 and 2");
                        flag = true;
                }
            }
            output.print("1->Create\n2->Read\n3->Update\n4->Delete\n5->ListAll\n6->Exit");
            choice = input.getInt("Enter Your Choice: ");
            switch (choice) {
                case 1:
                    cmsService.create();
                    break;
                case 2:
                    cmsService.read();
                    break;
                case 3:
                    cmsService.update();
                    break;
                case 4:
                    cmsService.delete();
                    break;
                case 5:
                    cmsService.listN();
                    break;
                case 6:
                    flag=true;
                    break;
                default:
                    output.print("choose between 1 and 6");
            }

        }
    }
}
