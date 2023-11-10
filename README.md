# Lsystem

使用 processing (Java) 寫的 L system 碎形繪圖

### Plant

```
variables : F
constants : [ ] + -
axiom  : F
rules  : (F → FF+[+F-F]-[+F-F])
```

https://github.com/afan0918/Lsystem/assets/70462625/963347f6-e01c-46b1-b7bf-60c18c618818

### Tree

```
variables : X F
constants : [ ] + -
axiom  : X
rules  : (X → F+[[X]-X]-F[-FX]+X), (F → FF)
```

https://github.com/afan0918/Lsystem/assets/70462625/3143867b-f6a2-415b-b1b3-db838a64e6c3

### Koch Snowflake

```
variables : F
constants : + -
axiom  : F--F--F
rules  : (F → F+F--F+F)
```

https://github.com/afan0918/Lsystem/assets/70462625/83e1cf56-5c58-4231-8e4f-acfb711268af

### Dragon

```
variables : F G
constants : [ ] + -
axiom  : F
rules  : (G → F), (F → G)
```

https://github.com/afan0918/Lsystem/assets/70462625/f51e65b1-28a2-47f7-ad42-81f185ff700f
