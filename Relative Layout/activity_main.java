<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/facebook"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginLeft="140dp"
        android:text="Facebook"
        android:textSize="20dp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/create"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/facebook"
        android:layout_centerHorizontal="true"
        android:text="Create a new account" />

    <EditText
        android:id="@+id/first"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/create"
        android:ems="10"
        android:gravity="center"
        android:hint="first name"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/surname"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/create"
        android:layout_toRightOf="@id/first"
        android:ems="10"
        android:gravity="center"
        android:hint="surname"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/mob"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/first"
        android:ems="10"
        android:gravity="center"
        android:hint="mobile number"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/newpass"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/mob"
        android:ems="10"
        android:gravity="center"
        android:hint="new password"
        android:inputType="textPassword" />

    <TextView
        android:id="@+id/dob"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/newpass"
        android:text="Date of birth" />

    <Spinner
        android:id="@+id/spinner1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignWithParentIfMissing="false"
        android:layout_below="@id/dob" />

    <Spinner
        android:id="@+id/spinner2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/dob"
        android:layout_toRightOf="@id/spinner1" />

    <Spinner
        android:id="@+id/spinner3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/dob"
        android:layout_toRightOf="@id/spinner2" />

    <TextView
        android:id="@+id/gender"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/spinner3"
        android:text="Gender" />

    <RadioButton
        android:id="@+id/radioButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/gender"
        android:layout_weight="1"
        android:text="Male" />

    <RadioButton
        android:id="@+id/radioButton3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/gender"
        android:layout_toRightOf="@id/radioButton2"
        android:layout_weight="1"
        android:text="Female" />

</RelativeLayout>