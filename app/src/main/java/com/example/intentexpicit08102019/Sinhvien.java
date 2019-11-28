package com.example.intentexpicit08102019;

import android.os.Parcel;
import android.os.Parcelable;

public class Sinhvien implements Parcelable {
    public String name;
    public String age;

    public Sinhvien(String name, String age) {
        this.name = name;
        this.age = age;
    }

    protected Sinhvien(Parcel in) {
        name = in.readString();
        age = in.readString();
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
    }
}
