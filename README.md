# Spinner Progress
Java Swing spinner progress animation custome using JprogressBar with flatlaf.

<img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/animated.gif" alt="animated"/>

## Installation
This project library do not available in maven central. Download [this](https://github.com/DJ-Raven/spinner-progress/raw/refs/heads/main/library/spinner-progress-1.0.0.jar) and create a folder in your project named `library` and place the downloaded JAR there.
- Copy jar library file to the root project. exp : `library/spinner-progress-1.0.0.jar`
- Add this code to `pom.xml`
``` xml
<dependency>
    <groupId>raven.swing</groupId>
    <artifactId>spinner-progress</artifactId>
    <version>1.0.0</version>
    <scope>system</scope>
    <systemPath>${basedir}/library/spinner-progress-1.0.0.jar</systemPath>
</dependency>
```
- Other library are use with this library
``` xml
<dependency>
  <groupId>com.formdev</groupId>
  <artifactId>flatlaf</artifactId>
  <version>3.4</version>
</dependency>

<dependency>
  <groupId>com.formdev</groupId>
  <artifactId>flatlaf-extras</artifactId>
  <version>3.4</version>
</dependency>
```

## Sample
``` java
SpinnerProgress spinner = new SpinnerProgress(new FlatSVGIcon("raven/swing/spinner/save.svg"));

spinner.setHorizontalTextPosition(SwingConstants.CENTER);
spinner.setVerticalTextPosition(SwingConstants.BOTTOM);

spinner.setStringPainted(true);

spinner.setIndeterminate(true)
```
## Change speed by using flatlaf properties

``` java
FlatMacLightLaf.setup();

UIManager.put("ProgressBar.cycleTime", 1000);
UIManager.put("ProgressBar.repaintInterval", 15);
```

| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;UI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Option | Description |
| ------------ | ------------ | ------------ |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/default.jpg" alt="default"/> | `spinner.setHorizontalTextPosition(SwingConstants.TRAILING);`</br>`spinner.setVerticalTextPosition(SwingConstants.CENTER);`</br>`spinner.setStringPainted(true);` | `default` |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/icon-bottom.jpg" alt="icon-bottom"/> | `spinner.setHorizontalTextPosition(SwingConstants.CENTER);`</br>`spinner.setVerticalTextPosition(SwingConstants.TOP);`</br>`spinner.setStringPainted(true);` | |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/icon-top.jpg" alt="icon-top"/> | `spinner.setHorizontalTextPosition(SwingConstants.CENTER);`</br>`spinner.setVerticalTextPosition(SwingConstants.BOTTOM);`</br>`spinner.setStringPainted(true);` | |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/icon.jpg" alt="icon"/> | `spinner.setStringPainted(false);` | `default` |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/text.jpg" alt="text"/> | `spinner.setStringPainted(true);` | Spinner no icon |
| <img src="https://github.com/DJ-Raven/spinner-progress/blob/main/screenshot/empty.jpg" alt="empty"/> | |No string painted and no icon |
