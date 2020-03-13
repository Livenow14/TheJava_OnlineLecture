package bytecode.example.Moja;


import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {

        try {
            new ByteBuddy().redefine(Moja.class)
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbits!"))
                    .make().saveIn(new File("C:\\Users\\Tae Jeong\\Desktop\\대학관련자료\\개인공부\\더자바_코드를 조작하는 다양한 방법\\TheJava_OnlineLecture\\me.bytecode.example\\target\\classes\\"));        //classes 까지의 path를 넣는다.
        } catch (IOException e) {
            e.printStackTrace();
        }
       //         System.out.println(new Moja().pullOut());       //위와와 같이 실행하면안됨

    }
}

