## Method Overloading

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
}```