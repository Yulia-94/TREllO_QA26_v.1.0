package com.telran26.tests;


import com.telran26.fm.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Set;

public class TestBase {


    /*
    Change gitignore
     git rm -r --cached .
     git add .
     git commit -m ".gitignore is now working"
    * */

    /*
    Logs
    git log --all --decorate --oneline --graph
    * */

    /*
    Revert back on one commit
    git revert HEAD --no-edit
    * */

    /*
    Revert to commit
    where hash is commit after revert
    git revert <hash> --no-edit
    * */


    protected ApplicationManager app = new ApplicationManager();


  @BeforeClass
    public void setUp(){
        app.start();


    }


    @AfterClass
    public void tearDown(){
        app.stop();


    }



}
