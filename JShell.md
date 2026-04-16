# JShell- The Java Shell Tool

- Interactively evaluate declarations, statements and expressions of the Java programming language in a read-eval-print loop(REPL)

```java
jshell [options] [load-files]
```
- *options*: Command-line options, separated by spaces.
- *load-files*: One or more scripts to run when the tool is started. Scripts can contain any valid code snippets or jshell commands.

| Name | Description |
|:-----|:------------|
| DEFAULT | Loads the default entries, which are commonly used as imports |
| JAVASE | Imports all Java SE packages. |
|PRINTING|Defines print, println and printf as jshell methods for use within the tool.|
|TOOLING|Defines javac,jar and other methods for running JDK tools via their command-line interface within the jshell tool.|

- For more than one script, use a space to separate the names. Scripts are run in the order in which they're entered on the command line. Command-line scripts are run after startup scripts. To run a script after the jshell is started, use the /open command.

- To accept input from standard input and suppress the interacitve I/O, enter a hyphen(-) for load-files. This enables the use of the jshell tool in pipe chains.

## Description

- jshell provides a way to interactively evaluate declarations, statements and expressions of the Java programming language, making it easier to learn the language, explore unfamiliar code and APIs, and prototype complex code. Java statements, variable definitions, method definitions, class definitions, import statements and expressions are accepted. The bits of code entered are called  *snippets*.

- As snippets are entered, they're evaluated, and feedback is provided. Feedback varies from the results and explanations of acting to nothing, depending on the snippet entered and the feedback mode chosen. Errors are described regardless of the feedback mode. Start with the verbose mode to get the most feedback while learning the tool.

- Command-line options are available for configuring the initial environment when jshell is started. Within jshell, commands are available for modifying the environment as needed.

- Existing snippets can be loaded from a file to initialize a jshell session, or at any time within a session. Snippets can be modified within the session to try out different variations and make corrections. To keep snippets for a later use, save them to a file.

## Options

- --add-exports module/package: Specifies a package to be considered as exported from its defining module.

- --add-modeules module[,module...]: Specifies the root modules to resolve in addition to the intial module.

- -Cflag: Provides a flag to pass to the compiler. To pass more than one flag, provide an instance of this option for each flag or flag argument needed.

- --class-path path: Specifies the directories and archives that are searched to locate class filed. The option overrides the path in the CLASSPATH environment variable isn't set and this option isn't used, then the current directory is searched.

    - **Linux and macOS**, use a colon( : ) to separate items in the path.
    - **Windows**, use a semicolon( ; ) to separate items.

- --enable-preview Allows code to depend on the preview features of this release.

- -- execution specification Specifies an alternate execution engine, where specification is an ExecutionControl spec.

- -- feedback mode Sets the inital level of feedback provided in response to what's entered. The initial level can be overriden within a session by using the /set feedback mode command. The default is normal.

The following values are valid for mode:

    - verbose: Provides detailed feedback for entries. Additional information about the action performed is displayed after the result of the action. The next prompt is separated from the feedback by a blank line.
    - normal: Provides an average amount of feedback. The next prompt is separated from the feedback by a blank line.
    - concise: Provides minimal feedback. The next prompt immediately follows the code snippet or feedback.
    - silent: Provides no feedback. The next prompt immediately follows the code snippet.
    - custom: Provides custom feedback based on how the mode is defined. Custom feedback modes are created within JShell by using the /set mode command.
    --help or -h or -? Prints a summary of standard options and exits the tool.
    --help-extra or -X Prints a summary of nonstandard options and exits the tool. Nonstandard options are subject to change without notice.
    -Jflag: Provides a flag to pass to the runtime system. To pass more than one flag, provide an instance of this option for each flag or flag argument needed.
    --module-path modulepath: Specifies where to find application modules.
        - For linux and macOS, use a colon( : ) to separate items in the path.
        - For windows, use a semicolon( ; ) to separate items.
    --no-startup: Prevents startup scripts from running when jshell starts. Use this option to run only the scripts entered on the command line when JShell is started, or to start JShell without any preloaded information if no scripts are entered. This option can't be used if the --startup option is used.
    -q: Sets the feedback mode to concise, which is the same as entering --feedback concise.
    - Rflag: Provides a flag to pass the remote runtime system. To pass more than one flag, provide an instance of this option for each flag or flag argument to pass.
    -s: Sets the feedback mode to silent, which is the same as entering --feedback silent.
    --show-version: Prints version information and enters the tool.
    --startup file: Overrides the default startup script for this session. The script can contain any valid code snippets or commands.

- For more than one script ,provide a separate instance of this option for each script. Startup scripts are run when jshell is first started and when the session is restarted with the /reset,/reload or /env command. Startup scripts are run in the order in which they're entered on the command line. 

## Commands
- Within jshell, commands are used to modify the environment and manage code snippets.

- /drop {name|id|startID-endID}[{name|id|startID-endID}...]: Drops snippets identified by name, ID, or ID range, making them inactive. For a range of IDs, provide the starting ID and ending ID separated with a hyphen. To provide a list, separate the items in the list with a space. Use the /list command to see the IDs of code snippets.

- /edit [option]: Opens an editor. If no option is entered, then the editor opens with the active snippets.
The following options are valid:
    - {name|id|startID-endID} [{name|id|startID-endID}...] Opens the editor with the snippets identified by name, ID, or ID range. For a range of IDs, provide the starting ID and ending ID separated with a hyphen. To provide a list, separate the items in the list with a space. Use the /list command to see the IDs of code snippets.

    - all Opens the editor with all snippets, including startup snippets and snippets that failed, were overwritten, or were dropped.

    - start Opens the editor with startup snippets that were evaluated when JShell was started. To exit edit mode, close the editor window, or respond to the prompt provided if the -wait option was used when the editor was set.

    - Use the /set editor command to specify the editor to use. If no editor is set, then the following environment variables are checked in order: JSHELLEDITOR, VISUAL, and EDITOR. If no editor is set in JShell and none of the editor environment variables is set, then a simple default editor is used.
- /env[options] Displays the environment settings, or updates the environment settings and restarts the session. If no option is entered, then the current environment settings are displayed. If one or more options are entered then the session is restarted as follows:
    - Updates the env settings with the provided options:
        - Resets the execution stae.
        - Runs the startup scripts.
        - Silently replays the history in the order entered. The history includes all valid snippets or /drop commands entered at the jshell prompt, in scripts entered on the command line, or scripts entered with the /open command.
- Environment settings entered on the command line or provided with a previous /reset, /env, or /reload command are maintained unless an option is entered that overwrites the setting.

The following options are valid:
    
    - --add-modules module[,module...] Specifies the root modules to resolve in addition to the initial module.
    - --add-exports source-module/package=target-module[,target-module]* Adds an export of package from source-module to target-module.
    - --class-path path Specifies the directories and archives that are searched to locate class files. This option overrides the path in the CLASSPATH environment variable. If the environment variable isn't set and this option isn't used, then the current directory is searched.
        - For Linux and macOS, use a colon (:) to separate items in the path.
        - For Windows, use a semicolon (;) to separate items.
    - --module-path modulepath Specifies where to find application modules.
        - For Linux and macOS, use a colon (:) to separate items in the path.
        - For Windows, use a semicolon (;) to separate items.

- /exit [integer-expression-snippet]: Exits the tool. If no snippet is entered, the exit status is zero. If a snippet is entered and the result of the snippet is an integer, the result is used as the exit status. If an error occurs, or the result of the snippet is not an integer, an error is displayed and the tool remains active.

- /history: Displays what was entered in this session.

- /help[command|subject] Displays info about commands and subjects. If no options are entered, then a summary of information for all commands and a list of available subjects are displayed. If a valid command is provided, then expanded information for that command is displayed. 

The following values for subject are valid:

    - context: Describes the options that are available for configuring the environment.
    - intro: Provides an introduction to the tool.
    - shortcutss: Describes keystrokes for completing commands and snippets. See input shortcuts.
 