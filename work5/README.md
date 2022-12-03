# 词汇表生成

## 【问题描述】

编写程序，打开一篇英文文章（存在当前目录下的文件in.txt中），为该文章生成词汇表（存到当前目录下的另一个文件words.txt中）。文章中单词指的是只由小写或大写字母组成的字符串，但词汇表中的单词都是以小写字母的形式出现，若文章中出现多个大小写无关的相同单词，只在词汇表中生成一个单词。假设生成的词汇表中单词个数不会超过100个，且每个单词的长度不会超过20。词汇表中的单词以字典顺序由小到大存放。

## 【输入形式】

输入的英文文章存储在当前目录下的文件in.txt中。

## 【输出形式】

输出的词汇表存储到当前目录下的文件words.txt中，每个单词独占一行，以字典顺序由小到大存放。

## 【输入样例】

假如in.txt中的文章内容如下：

```
C was originally designed for and implemented on the UNIX operating system on the DEC PDP-11, by Dennis Ritchie.
The book is not an introductory programming manual.
```
## 【输出样例】

生成的词汇表存储在words.txt中，其内容应如下所示：
```
an
and
book
by
c
dec
dennis
designed
for
implemented
introductory
is
manual
not
on
operating
originally
pdp
programming
ritchie
system
the
unix
was
```

## 【样例说明】

读入的英文文章中，所有的英文字母串（由一个或多个连续字母组成）都将对应生成词汇表中的一个单词，例如：文章中的两个the和一个The对应生成词汇表中单词the；单个字母C也作为单个单词出现，所以也对应生成词汇表中的一个单词c。

## 【评分标准】

该题要求输出一篇英文文章的词汇表。