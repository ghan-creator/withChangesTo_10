import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//for hw8
public class MainPageTests extends BaseUI {

    @Test
    public void testMainPage(){

        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        mainPage.startYouTubeVideo();
        driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);
    }
}




















//========================================================================
//=============fixed with java, but not working with TestNG=================
//import org.testng.annotations.Test;
//        import java.io.Serializable;
//        import java.util.concurrent.TimeUnit;
////for hw8
//public class MainPageTests8 extends BaseUI implements Serializable{
//
//    private Object condition;
//    private Object ThrowableTracer;
//
//    @Test
//    public void testMainPage(Object condition) {
//        try {
//            while (true) {
//                condition = mainPage.startYouTubeVideo();
//                condition = this.condition;
//                driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
//                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//                mainPage.startYouTubeVideo();
//                driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);
//                continue;
//                //catch (Exception e) {
//            }
//        } finally {
//        }
//    }
//    public final void addSuppressed(Throwable exception){
//        // creating a suppressed Exception
//        Exception suppressed = new ArithmeticException();
//
//        // creating a IOException object
//        final Exception exe = new Exception();}}
//

//====================================================================================================
//does not work with testNG
///Library/Java/JavaVirtualMachines/jdk-11.0.7.jdk/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=61047:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/testng/lib/testng-rt.jar:/Users/santa/Documents/project/romance_abroad/target/test-classes:/Users/santa/Documents/project/romance_abroad/target/classes:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-support/3.141.59/selenium-support-3.141.59.jar:/Users/santa/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:/Users/santa/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:/Users/santa/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:/Users/santa/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:/Users/santa/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:/Users/santa/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:/Users/santa/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:/Users/santa/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:/Users/santa/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:/Users/santa/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:/Users/santa/.m2/repository/org/testng/testng/7.1.0/testng-7.1.0.jar:/Users/santa/.m2/repository/com/beust/jcommander/1.72/jcommander-1.72.jar:/Users/santa/.m2/repository/com/google/inject/guice/4.1.0/guice-4.1.0-no_aop.jar:/Users/santa/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:/Users/santa/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/Users/santa/.m2/repository/org/yaml/snakeyaml/1.21/snakeyaml-1.21.jar:/Users/santa/.m2/repository/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar:/Users/santa/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/testng/lib/jcommander-1.27.jar com.intellij.rt.testng.RemoteTestNGStarter -usedefaultlisteners false -socket61046 @w@/private/var/folders/gw/js6290rd1c12d88dnqb5wd400000gn/T/idea_working_dirs_testng.tmp -temp /private/var/folders/gw/js6290rd1c12d88dnqb5wd400000gn/T/idea_testng.tmp
//        [Utils] [ERROR] [Error] org.testng.TestNGException:
//        Cannot inject @Test annotated Method [testMainPage] with [class java.lang.Object].
//        For more information on native dependency injection please refer to http://testng.org/doc/documentation-main.html#native-dependency-injection
//        at org.testng.internal.Parameters.checkParameterTypes(Parameters.java:441)
//        at org.testng.internal.Parameters.createParametersForMethod(Parameters.java:355)
//        at org.testng.internal.Parameters.createParameters(Parameters.java:712)
//        at org.testng.internal.Parameters.handleParameters(Parameters.java:879)
//        at org.testng.internal.Parameters.handleParameters(Parameters.java:744)
//        at org.testng.internal.ParameterHandler.handleParameters(ParameterHandler.java:59)
//        at org.testng.internal.ParameterHandler.createParameters(ParameterHandler.java:38)
//        at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:783)
//        at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
//        at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
//        at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
//        at org.testng.TestRunner.privateRun(TestRunner.java:766)
//        at org.testng.TestRunner.run(TestRunner.java:587)
//        at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
//        at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
//        at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
//        at org.testng.SuiteRunner.run(SuiteRunner.java:286)
//        at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
//        at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
//        at org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)
//        at org.testng.TestNG.runSuitesLocally(TestNG.java:1109)
//        at org.testng.TestNG.runSuites(TestNG.java:1039)
//        at org.testng.TestNG.run(TestNG.java:1007)
//        at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
//        at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)

//=============================================================
/*
import org.testng.annotations.Test;

        import java.io.Serializable;
        import java.util.concurrent.TimeUnit;

//for hw8
public class MainPageTests8 extends BaseUI implements Serializable{

    private Object condition;
    private Object ThrowableTracer;

    @Test
    public void testMainPage(Object condition) {
        try {
            while (true) {
                condition = mainPage.startYouTubeVideo();
                condition = this.condition;
                driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                mainPage.startYouTubeVideo();
                driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);

                continue;
                //catch (Exception e) {
            }
            //catch (Throwable e){
//            try {
//                //.Throwable[] suppExe = (Throwable[]) ThrowableTracer;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            // getStackTrace()
//            //getSuppressed();


            //e.printStackTrace();
            //  }}
            //  } ;
            // System.out.println("Exception : throw ElementNotInteractableException " + condition);
        } finally {

        }}
    public final void addSuppressed(Throwable exception){
        // creating a suppressed Exception
        Exception suppressed = new ArithmeticException();

        // creating a IOException object
        final Exception exe = new Exception();}}

//        // adding suppressed Exception
//        // using addSuppressed method
//        exe.addSuppressed(suppressed);
//
//        // throwing IOException //element not found exeption
//        //throw exe;
//    }
//
//};



//                {
//                    //System.out.println("Exception : throw ");
//                        //"org.openqa.selenium.ElementNotInteractableException here");
//
//                 //   }
//
////                throw ElementNotInteractableException("ElementNotInteractableException" + e);
////            } catch (Exception e) {
//                    //System.out.println("Exception : throw ElementNotInteractableException " + condition);
//
////            }
//
//                  //  System.out.println("org.openqa.selenium.ElementNotInteractableException here?");
//                    //("org.openqa.selenium.ElementNotInteractableException here");
//
//                }
//            }
//
*/
