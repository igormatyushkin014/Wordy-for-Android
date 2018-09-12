<p align="center" >
	<img src="/Images/logo_2048_600.png" alt="Wordy" title="Wordy">
</p>

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

* Android SDK 15 and later
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

### Case Effect

Represented by `CaseEffect` class. Changes case for the entire text or letters at particular positions.

Constructor example:

```java
new CaseEffect(
    TextCase.FIRST_UPPER_NEXT_LOWER
)
```

[`TextCase`](#text-case) is the only setting that defines `CaseEffect`'s behavior.

### Rotation Effect

Represented by `RotationEffect` class. Rotates letters. For example,

`p` becomes `d`

and

`h` becomes `ɥ`.

`RotationEffect` has two available constructors. The most detailed version of constructor:

```java
new RotationEffect(
    TextRotation.INVERTED,
    true
)
```

The first parameter is a [`TextRotation`](#text-rotation) value that defines the way to rotate symbols.

The second parameter of boolean type defines whether the rotation alrorithm should be case sensitive. If it equals to `false`, some uppercased symbols might become lowercased as a result of rotation.

The second constructor is a simplified version of the first one:

```java
new RotationEffect(
    TextRotation.INVERTED
)
```

It's case sensitive by default. Usually, it's enough to use the second constructor excepting cases when you need more flexibility.

### Inversion Effect

Represented by `InversionEffect` class. Flips text from right to left, so

`Hi!`

turns into

`!iH`

`InversionEffect`'s constructor is very simple and doesn't require any parameters:

```java
new InversionEffect()
```

## Options

### Text Case

`TextCase` is used as a setting for `CaseEffect` instance. Available values are:

- `ALL_UPPER` - Makes the entire text uppercased.
- `ALL_LOWER` - Makes the entire text lowercased.
- `FIRST_UPPER_NEXT_LOWER` - The first symbol is uppercased, other text is lowercased.
- `FIRST_LOWER_NEXT_UPPER` - The first symbol is lowercased, other text is uppercased.

### Text Rotation

`TextRotation` defines the conditions of symbol rotation. Available values:

- `NORMAL`: Forces all symbols to be rotated to normal position. It means that `ʎ` would become `y` and `h` would stay `h`.
- `UPSIDE_DOWN`: Forces all symbols to be rotated upside down. In this case, `y` would turn into `ʎ`, but `ɥ` wouldn't change at all.
- `INVERTED`: Normal symbols are forced to be rotated meanwhile rotated symbols become normal. So, `y` becomes `ʎ` and `ɥ` turns into `h`.

## License

`Wordy` is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
