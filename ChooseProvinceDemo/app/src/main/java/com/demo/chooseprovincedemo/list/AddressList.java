package com.demo.chooseprovincedemo.list;

import com.demo.chooseprovincedemo.model.person;
import com.demo.chooseprovincedemo.utils.AddressUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengwei on 2017/5/15.
 */

public class AddressList {
    /**
     * 获取各省份市的集合
     * @param mProvinceId 省份Id
     * @return 省份市的集合
     */
    public static List<person> getCityList(int mProvinceId){
        List<person> cityList = new ArrayList<>();
        switch (mProvinceId){
            case 109000238:
                for (int i = 0; i < AddressUtils.shanxiName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiName[i]);
                    mPerson.setId(AddressUtils.shanxiId[i]);
                    cityList.add(mPerson);
                }
                break;
            case 109000380:
                for (int i = 0; i < AddressUtils.neimengguName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguName[i]);
                    mPerson.setId(AddressUtils.neimengguId[i]);
                    cityList.add(mPerson);
                }
                break;
        }
      return cityList;
    }

    /**
     * 获取各市县（区）的集合
     * @param mCityId 市的Id
     * @return 市县（区）的集合
     */
    public static List<person> getCountryList(int mCityId){
        List<person> countryList = new ArrayList<>();
        switch (mCityId){
            case 109000239:
                for (int i = 0; i < AddressUtils.shanxiTaiyuanName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiTaiyuanName[i]);
                    mPerson.setId(AddressUtils.shanxiTaiyuanId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000264:
                for (int i = 0; i < AddressUtils.shanxiYangquanName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiYangquanName[i]);
                    mPerson.setId(AddressUtils.shanxiYangquanId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000251:
                for (int i = 0; i < AddressUtils.shanxiDatongName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiDatongName[i]);
                    mPerson.setId(AddressUtils.shanxiDatongId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000271:
                for (int i = 0; i < AddressUtils.shanxiChangzhiName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiChangzhiName[i]);
                    mPerson.setId(AddressUtils.shanxiChangzhiId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000286:
                for (int i = 0; i < AddressUtils.shanxiJinchengName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiJinchengName[i]);
                    mPerson.setId(AddressUtils.shanxiJinchengId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000294:
                for (int i = 0; i < AddressUtils.shanxiShuozhouName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiShuozhouName[i]);
                    mPerson.setId(AddressUtils.shanxiShuozhouId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000302:
                for (int i = 0; i < AddressUtils.shanxiJinzhongName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiJinzhongName[i]);
                    mPerson.setId(AddressUtils.shanxiJinzhongId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000315:
                for (int i = 0; i < AddressUtils.shanxiYunchengName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiYunchengName[i]);
                    mPerson.setId(AddressUtils.shanxiYunchengId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000330:
                for (int i = 0; i < AddressUtils.shanxiXinzhouName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiXinzhouName[i]);
                    mPerson.setId(AddressUtils.shanxiXinzhouId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000346:
                for (int i = 0; i < AddressUtils.shanxiLinfenName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiLinfenName[i]);
                    mPerson.setId(AddressUtils.shanxiLinfenId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000365:
                for (int i = 0; i < AddressUtils.shanxiLvliangName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.shanxiLvliangName[i]);
                    mPerson.setId(AddressUtils.shanxiLvliangId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000381:
                for (int i = 0; i < AddressUtils.neimengguHuhehaoteName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguHuhehaoteName[i]);
                    mPerson.setId(AddressUtils.neimengguHuhehaoteId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000392:
                for (int i = 0; i < AddressUtils.neimengguBaotouName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguBaotouName[i]);
                    mPerson.setId(AddressUtils.neimengguBaotouId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000403:
                for (int i = 0; i < AddressUtils.neimengguWuhaiName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguWuhaiName[i]);
                    mPerson.setId(AddressUtils.neimengguWuhaiId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000408:
                for (int i = 0; i < AddressUtils.neimengguChifengName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguChifengName[i]);
                    mPerson.setId(AddressUtils.neimengguChifengId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000422:
                for (int i = 0; i < AddressUtils.neimengguTongliaoName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguTongliaoName[i]);
                    mPerson.setId(AddressUtils.neimengguTongliaoId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000432:
                for (int i = 0; i < AddressUtils.neimengguEerduosiName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguEerduosiName[i]);
                    mPerson.setId(AddressUtils.neimengguEerduosiId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000441:
                for (int i = 0; i < AddressUtils.neimengguHulunbeierName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguHulunbeierName[i]);
                    mPerson.setId(AddressUtils.neimengguHulunbeierId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000456:
                for (int i = 0; i < AddressUtils.neimengguBayanzhuoerName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguBayanzhuoerName[i]);
                    mPerson.setId(AddressUtils.neimengguBayanzhuoerId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000465:
                for (int i = 0; i < AddressUtils.neimengguWulanchabuName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguWulanchabuName[i]);
                    mPerson.setId(AddressUtils.neimengguWulanchabuId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000478:
                for (int i = 0; i < AddressUtils.neimengguXinganName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguXinganName[i]);
                    mPerson.setId(AddressUtils.neimengguXinganId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000485:
                for (int i = 0; i < AddressUtils.neimengguXilinguoleName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguXilinguoleName[i]);
                    mPerson.setId(AddressUtils.neimengguXilinguoleId[i]);
                    countryList.add(mPerson);
                }
                break;
            case 109000498:
                for (int i = 0; i < AddressUtils.neimengguAlashanName.length; i++){
                    person mPerson = new person();
                    mPerson.setName(AddressUtils.neimengguAlashanName[i]);
                    mPerson.setId(AddressUtils.neimengguAlashanId[i]);
                    countryList.add(mPerson);
                }
                break;
        }
        return countryList;
    }


}
