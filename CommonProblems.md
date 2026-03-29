# Compiler Problems

- *'javac' is not recognised as an internal or external command, operable program or batch file.*
    - this error means that windows cannot find the compiler(javac).
    - To fix this we can mention the path of the compiler in the command, or add the path to the PATH variable.

- *Class names, 'Hello' are only accepted if annotation processing is explicitly requested*
    - This error tells us that we forgot to mention the .java suffix when compiling the program.

- *Syntax Errors*
    - If we mistype part of a program, the compiler may issue a syntax error. The message usually displays the type of the error, the line number where the error was detected, the code on the line and the position of the error within the code. 

- *Semantic Errors*
    - In addition to verifying that our program is syntactically correct, the compiler checks for other basic correctness. For example, the compiler warns us each time we use a varible that has not been initialized.

# Runtime Problems

- *Exception in thread "main" java.lang.NoClassDefFoundError: Hello*

    - if we recieve this error, java cannot find the bytecode file.
    - if the problem persists after changing the directory then we might need to change our CLASSPATH variable.

- *Could not find or load main class Hello.class*
    - Common mistake to run java launcher on the bytecode.
    - The argument is the name of the class that we need to run, not the filename.

- *Exception in thread "main" java.lang.NoSuchMethodError:main*
    - The Java VM requires that the class we execute with it have a main method at which to begin execution of our application.

- *Applet or Java Web Start Appication is Blocked*
    - If we are running an application through a browser and get security warnings that say the application is blocked, we can check the following items:
        - Verify that the attributes in the JAR file manifest are set correctly for the environment in which the application is running. The Permissions attribute is required. *manifest.mf*.
        - Verify that the application is signed by a valid certificate and that the certificate is located in the *Signer CA keystore*.
        - If we are running a local applet,we need to set up a web server to use for testing. We can also add our application to the exception site list, which is managed in the Security tab of the Java Control Panel.