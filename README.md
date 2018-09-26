# Artifact Java
The goal of this program is to exercise at multiple inheritance. An artifact consists of an index, a creator and a year of creation. A masterpiece, which is a type of artifact, consists of a movement (impressionism, expressionism, naturalism) and a condition (bad, good, excellent). There are two types of masterpieces, paintings and sculptures. A painting consists of dimensions (length and width) and a technique (oil,aquarelle, tempera). A sculpture consists of volume and material (iron, stone, wood). The function auction takes as argument the desired movement and condition and evaluates the artifacts.


![Hierarchy](https://github.com/patschris/ArtifactJava/blob/master/Hierarchy.PNG)

**Execution command** <br/> 
./artifact *N* *mvmt* *cond* <br/>
where:
 - *N*: the amount of artifacts
 - *mvmt*: The movement of the artifacts (0:Impessionism, 1:Expressionism, 2:Naturalism)
 - *cond*: The condition of the artifacts (0:Bad, 1:Good, 2:Excellent)

**Makefile**
- `make`: compile with default arguments (N=5, mvmt=1, cond 1)
- `make clean`: delete the object files and the executable

Written in Java 1.8, Ubuntu 16.04.3 LTS. 
