<p align="center">
	<a href="https://http://www.android.com">
		<img src="https://img.shields.io/badge/android-23-green.svg?style=flat">
	</a>
	<a href="https://tldrlegal.com/license/apache-license-2.0-(apache-2.0)">
		<img src="https://img.shields.io/badge/License-Apache 2.0-blue.svg?style=flat">
	</a>
</p>

## At a Glance

`Wordy` is a powerful text processor that provides an easy way to manage content in `String` object.

## How to Get Started

Add `jitpack.io` repository to your project:

```javascript
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Then add `Wordy` to dependencies list:

```javascript
dependencies {
    implementation 'com.github.igormatyushkin014:Wordy-for-Android:1.0'
}
```

## Requirements

* Android SDK 23 and later
* Android Studio 3.0 and later
* Java 7 and later

## Usage

### Text Filter

First of all, you need to get to know `TextFilter` class. Instance of `TextFilter` is your entry point to the world of amazing effects. Look at example below:

```java
String invertedText = new TextFilter("Hi!")
    .apply(new InversionEffect())
    .getResult();
System.out.println(invertedText); // "!iH"
```

This is how it works. You have to get an instance of `TextFilter` and transfer source text to it. Then, apply some effects and retrieve the final text by `.getResult()` call.

You can add as many effects as you want:

```java
String invertedText = new TextFilter("This text will be rotated")
    .apply(new RotationEffect(TextRotation.INVERTED))
    .apply(new InversionEffect())
    .getResult();
System.out.println(invertedText); // "рǝʇɐʇоɹ ǝq llıм ʇxǝʇ sıɥʇ"
```

## Text Effects

Below you can see the full list of available effects:

<table>
  <tr>
    <th>Class</th>
    <th>Constructor example</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>
      <code>CaseEffect</code>
    </td>
    <td>
      <code>new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER)</code><br>
    </td>
    <td>
      Changes case for the entire text or letters at particular positions.
    </td>
  </tr>
    <td>
      <code>RotationEffect</code>
    </td>
    <td>
      <code>new RotationEffect(TextRotation.UPSIDE_DOWN)</code><br>
    </td>
    <td>
      Rotates letters. For example, <code>p</code> becomes <code>d</code> and <code>h</code> becomes <code>ɥ</code>.
    </td>
  </tr>
</table>

## License

`Wordy` is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
