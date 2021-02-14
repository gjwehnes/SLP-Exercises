echo "compile ex001"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex001/Main.java src/ex001/Test001.java 
echo "compile ex002"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex002/Main.java src/ex002/Test002.java 
echo "compile ex003"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex003/Main.java src/ex003/Test003.java 
echo "compile ex004"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex004/Main.java src/ex004/Test004.java 
echo "compile ex005"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex005/Main.java src/ex005/Test005.java 
echo "compile ex006"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex006/Student.java src/ex006/StudentTest.java 
echo "compile ex007"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex007/Bicycle.java src/ex007/BicycleTest.java 
echo "compile ex008"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex008/Dog.java src/ex008/DogTest.java 
echo "compile ex009"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex009/Car.java src/ex009/CarTest.java 
echo "compile ex010"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex010/StoreProduct.java src/ex010/StoreProductTest.java 
echo "compile ex011"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex011/Stock.java src/ex011/StockTest.java
echo "compile ex012"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex012/Person.java src/ex012/PersonTest.java
echo "compile ex013"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex013/InchWorm.java src/ex013/InchWormTest.java
echo "compile ex014"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . src/ex014/StringFormatter.java src/ex014/StringFormatterTest.java
echo "compile Main"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . Main.java
echo "compile ex001"
java -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar Main
