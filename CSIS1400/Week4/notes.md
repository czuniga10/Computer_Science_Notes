# Getters and Setters
___________________________

### Getters are methods that "GET" info from a different class
```
myBall.getBallSize(); //no parameters, and will have a return statement in the method
```
### Setters are methods that "SET" info from a different class
```
myBall.setBallSize(double size) //has parameters in the form of the expected type and feild name
```


//When using a Setter, you might come accross a feild name that is the same as expected parameter variable name. IF this occures, use this.feildName = new parameter name

ex: 
```
public void setX(int x) {
    this.x = x;
}
```



## A parameter is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.

## -An argument is a value provided to a method's parameter during a method call. Ex: A pizza area method might be called as printPizzaArea(12.0) or as printPizzaArea(16.0).