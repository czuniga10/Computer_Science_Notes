# Method Overloading

Methods within the same class, with the same name, but must have different parameter lists...
  ________________
ex:
(perfectly fine) 

```
public void getX() {  
    ...   

    ...    
}
public String getX(int x) {  
    return ...

    ...
}
```


ex:(won't compile)

```
public Int setX(int x) {  
    ...

    ...
}
public String setX(int x) {  
    return ...

    ...
}
```




# Promotion and Casting
________________
## Promotion  
#### -float can be promoted to double  
#### -long can be promoted to double and float  
#### -int can be promoted to double and float and long  
#### etc...   
![img](img.png "Logo Title Text 1")  
![img](img2.png "Logo Title Text 1")  

## Casting  
#### can do the opposite of Promotion, but need to explicitly say what type the new value will be

ex:
```
long l = 14L;

int i = l;
```
WILL NOT WORK

Must use casting
```
long l = 14L;

int i = (int)l;
```


# Midterm prac:
    - programming language
    - caseSensitive
    - object oriented
    - extensible (you can create your own types)

#### who created it:
    James Gosling
    was originally Oak, but name was taken, so went with Java
    -

#### When:
    early 90's

#### Steps to write a program:
    -understand prob
    -find way to solve prob
    -write code / fix errors
    -compile
    -run program

Format Specifiers:
%s-string
%b-boolean
%f-float/double
%f-float with 2 digits after dec
%d-int
%5d-column of width 5 right aligned
%-5d-column of width 5 left aligned

### Method declaration

         public double perimeter(int length, int weidth)
<!-- access mod  return   name       param list -->

Method calls
    specify NO type. The arg list can include values but no explicit typ info

Method declarations
    specify a type. The param list includes type-name pairs and in front fo the method name there is always a return type specified

variable declarations
    have NO parenthesis. they are type-name pairs

method or constructor
    declarations both have list delimited by parenthesis

method declarations
    Always has a return type

constructor declarations
    NEVER specify return type. and will be same name as class
