# Natek
Natek Demo

Natek-monsterdemo is a selenide based test automation platform for performing UI 
  based automation. 

### Tech stack used in building the framework 
##### Programming language used: java 1.8
##### Unit Test framework : TestNG version 6.14.3
##### Automation API : Selenide 5.11.1
##### Build tool: Maven
##### Chrome browser: Latest version (83.0.4103.61)

### Prerequisite 1
##### java should be installed on the system.To check if java is available on the system, go to command prompt and type java -version.It should display: 
    
"java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)".

### Prerequisite 2 (not mandatory)
##### git should be configured on the system to pull the project from github. 

If github is not configured on the system, then project can be downloaded using the option "Download ZIP" from https://github.com/rohitbahadur/Natek





### Installation (using git, assumption is a repo created on github )
1. If using git,create a project folder on your local machine.
2. From the git repo click on Clone or download option and copy the link. 
2. Go to command prompt and navigate to the project and folder and type git clone "copy the link" (copy the link is the link copied from git repo).

..


### Installation (without git)
1. There is no additional settings or configurations required. The 
   project can be downloaded using git or option "Download ZIP" from 
   https://github.com/rohitbahadur/Natek.
2. unzip (if downloaded as a ZIP) the project folder and open in eclipse 
    (File-->Open Projects from File System ). Select the directory where 
    the project folder is available.



#### Project Design Strategy
#### The project is designed using Action based principles.
1. demo package --> This package has the tests to be executed.
2. demo. actions --> This packages contains all the information about the actions performed on different pages / elements.
3. demo.data and demo. ui --> These packages contains the data used for login and UI elements for interaction. 

## Note:There is no need to download or setup any browser driver binaries as this is interrnally taken care by Selenide.
4.  All the dependency required for project execution are available under pom.xml.


#### Execution procedure
Do mention the path of java compiler on your local system @ in the build --> plugins--> configurations--> executable tab 
 ```<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<fork>true</fork>
					<executable>C:\Program Files\Java\jdk1.8.0_201\bin\javac</executable>
				</configuration>
			</plugin>
			</plugins>
	</build>```
 
 in pom.xml

     For executing the tests, expand monster folder and right click on pom.xml and select Run As --> Maven test
     


