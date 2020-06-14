package com.cms.menu;

import com.cms.component.DaggerObjComponent;
import com.cms.exception.CmsException;
import com.cms.service.ICmsService;
import com.cms.stream.Input;
import com.cms.stream.Output;

public class Menu {
    boolean flag;

    public void DisplayMenu() throws CmsException {
        ICmsService service = DaggerObjComponent.create().providesCmsService();
        Input input= DaggerObjComponent.create().provideInput();
        Output output=DaggerObjComponent.create().provideOutput();
        int choice=0;
        int selectCms=0;
        flag=true;
        while (true) {
            while (flag) {
                flag = false;
                output.print(" 1->Teacher MS\n 2->Student MS\n 3->Exit");
                selectCms = input.getInt("Enter Your Choice: ");
                switch (selectCms) {
                    case 1:
                        service.setFlag(true);
                        break;
                    case 2:
                        service.setFlag(false);
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
                    service.create();
                    break;
                case 2:
                    service.read();
                    break;
                case 3:
                    service.update();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    service.listN();
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
