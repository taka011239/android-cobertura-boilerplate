# android-cobertura-skeleton

This is an Android skeleton project configured with:

  * [Robolectric](http://robolectric.org)
  * [JUnit](http://junit.org)
  * [Cobertura](http://cobertura.github.io/cobertura)
  * [Mockito](http://code.google.com/p/mockito)

# Configure the project in Eclipse

  1. Clone the repository or download the zip.
  2. Import both projects in Eclipse, HelloWorld and HelloWorldTest
  3. Change "HelloWorld" project names to use yours, for example:
    * HelloWorld -> MyProject
    * HelloWorldTest -> MyProjectTest
  3. Modify HelloWorldTest/build.xml property ```android.project.path``` to point to your source project.
  4. Add HelloWorld project to HelloWorldTest build path.
    * Second button on HelloWorldTest > properties > Java build path > Projects tab
    * Add HelloWorld project clicking on add button on the right
  5. Open HelloWorldTest/src/org.robolectric.Config.properties
    * Change ```manifest: ../HelloWorld/AndroidManifest.xml``` to point to your source project.

# Running project using ANT

There are some targets prepared for ant un HelloWorldTest/build.xml:

  * ant cobertura: Execute JUnit and create Cobertura results.
  * ant report: 
    * Execute JUnit and Cobertura
    * Generate HTML reports for both JUnit and Cobertura under HelloWorldTest/cobertura-results
    * Generate XML reports under HelloWorldTest/cobertura-results/junit-reports

# Special Mentions

  * Verónica Rodriguez Hermida: For helping me testing coverage alternatives.

# Disclaimer

YAAL is provided as it is and with NO support. Any improvement depends on my free time.
