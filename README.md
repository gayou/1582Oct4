# Oct4,1582
ユリウス暦からグレゴリオ暦への改暦により、  
ユリウス暦1582年10月4日の翌日がグレゴリオ暦の同年10月15日であるため、  
1582年は10月5日 - 14日が存在しない。

というわけで、1582年10月4日の翌日が何日になるかを検証する。


## Java
Javaは内部的にユリウス暦とグレゴリオ暦の切り替えを行っている。

### ソースコード
```
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(1582, Calendar.OCTOBER, 4);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.getTime());
		
		System.out.println("---------------");
		
		c = new GregorianCalendar(1582, Calendar.OCTOBER, 4);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.getTime());
	}

}
```

### 実行
```
$ java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)
$ 
$ javac Test.java
$ java Test
Thu Oct 04 03:29:27 JST 1582
Fri Oct 15 03:29:27 JST 1582
---------------
Thu Oct 04 00:00:00 JST 1582
Fri Oct 15 00:00:00 JST 1582
```


## PHP
Javaみたいなことはやってない。

### ソースコード
```
<?php

//DateTime
$date = new DateTime('1582-10-04');
echo $date->format('Y-m-d')."\n";
echo $date->modify('+1 days')->format('Y-m-d')."\n";
```

### 実行
```
$ php -v
PHP 7.4.0 (cli) (built: Mar 14 2020 18:05:20) ( NTS )
Copyright (c) The PHP Group
Zend Engine v3.4.0, Copyright (c) Zend Technologies
$ 
$ php Test.php 
1582-10-04
1582-10-05
```


## Python
Javaみたいなことはやってない。

### ソースコード
```
import datetime

date = datetime.date(1582, 10, 4)
print(date)
print(date + datetime.timedelta(days=1))
```

### 実行
```
$ python3 --version
Python 3.7.5
$
$ python3 Test.py 
1582-10-04
1582-10-05
```
