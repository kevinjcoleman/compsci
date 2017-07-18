# Monday notes
### Fence post algorithm.
- Add fence post before the loop.
- Add fence post after the loop.
- ie:
```
for item
  puts item ,
end
puts item.last
```
or
```
puts item.first
for item
  puts , item
end
```

### Sentinel loop
Loop with a value that makes it stop.
```
input = ''
while input != 'quit'
  p "type \"quit\" to stop"
  gets.chomp
end
```

### Definite loops
Loops where there is a defined amount of loops that will happen.
```
1.upto(9) do |i|
  p i
end
```

### Indefinite loops
```
input = ''
while input != 'quit'
  p "type \"quit\" to stop"
  gets.chomp
end
```

### Pseudorandom Numbers
Numbers that, although they are derived from predictable and well-defined algorithms, mimic the properties of numbers chosen at random.


### Priming a Loop
Initializing variables before a loop to “prime the pump” and guarantee that the loop is entered.
