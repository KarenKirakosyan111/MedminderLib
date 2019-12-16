package com.medlib.provisioningmodule;

import android.os.Parcel;
import android.os.Parcelable;

public class ProvisioningModel implements Parcelable {

    private String identityUrl;
    private String baseUrl;
    private String apiKey;
    private String serialNumber;

    public ProvisioningModel(String identityUrl, String baseUrl, String apiKey, String serialNumber) {
        this.identityUrl = identityUrl;
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.serialNumber = serialNumber;
    }

    private ProvisioningModel(Parcel parcel) {
        this.identityUrl = parcel.readString();
        this.baseUrl = parcel.readString();
        this.apiKey = parcel.readString();
        this.serialNumber = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identityUrl);
        parcel.writeString(this.baseUrl);
        parcel.writeString(this.apiKey);
        parcel.writeString(this.serialNumber);
    }

    public static final Parcelable.Creator<ProvisioningModel> CREATOR
            = new Creator<ProvisioningModel>() {
        @Override
        public ProvisioningModel createFromParcel(Parcel parcel) {
            return new ProvisioningModel(parcel);
        }

        @Override
        public ProvisioningModel[] newArray(int i) {
            return new ProvisioningModel[i];
        }
    };

    public String getIdentityUrl() {
        return identityUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
