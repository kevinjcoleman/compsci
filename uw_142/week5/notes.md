# Monday notes
Fence post algorithm.
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

Sentinel loop
- loop with a value that makes it stop.
```
input = ''
while input != 'quit'
  p "type \"quit\" to stop"
  gets.chomp
end
```
