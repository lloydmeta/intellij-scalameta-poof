# Bug repro

Clicking on the expand-macro gutter icon [on this line](https://github.com/lloydmeta/intellij-scalameta-poof/blob/master/src/main/scala/poof/Maths.scala#L5) causes IntelliJ to delete the entire file with no warning.

The project compiles and passes tests otherwise.