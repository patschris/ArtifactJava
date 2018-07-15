JC		=	javac
JVM		=	java
MAIN    =   Main
ARG1	=	5
ARG2	=	1
ARG3	=	1


.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

CLASSES = \
		Artifact.java \
		Masterpiece.java \
		Painting.java \
		Sculpture.java \
		Condition.java \
		Material.java \
		Movement.java \
		Technique.java \
		ArtifactHolder.java \
		Main.java

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN) $(ARG1) $(ARG2) $(ARG3)

clean:
	$(RM) *.class
