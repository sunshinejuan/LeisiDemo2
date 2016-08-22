package com.gjj.administrator.leisidemo.model;

import java.util.List;

/**
 * Created by Administrator on 2016/8/19 0019.
 */
public class VBean {

        /**
         * product : {"product_price_unit":[{"key":"yuan/yard","value":"元/码"},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨","def":true},{"key":"yuan/one","value":"元/条"}],"product_cloth_price_unit":[{"key":"yuan/kg","value":"元/公斤","def":true}],"product_product_price_unit":[{"key":"yuan/yard","value":"元/码","def":true},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨"},{"key":"yuan/one","value":"元/条"}],"product_width_unit":[{"key":"cm","value":"厘米","def":true}],"product_height_unit":[{"key":"cm","value":"厘米","def":true}],"product_freeheight_unit":[{"key":"cm","value":"厘米","def":true}],"product_weight_unit":[{"key":"yard/kg","value":"码/公斤","def":true},{"key":"m/kg","value":"米/公斤"},{"key":"one/kg","value":"条/公斤"}],"product_inventory_unit":[{"key":"ton","value":"吨"},{"key":"kg","value":"公斤","def":true},{"key":"one","value":"条"},{"key":"yard","value":"码"}],"product_uptime_density_unit":[{"mesh":"kg","value":"网眼","def":true}]}
         * shopProduct : {"product_shop_price_origin_unit":[{"key":"yuan/yard","value":"元/码"},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨","def":true},{"key":"yuan/one","value":"元/条"}],"product_shop_price_on_sale_unit":[{"key":"yuan/yard","value":"元/码"},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨","def":true},{"key":"yuan/one","value":"元/条"}],"product_shop_inventory_unit":[{"key":"ton","value":"吨"},{"key":"kg","value":"公斤","def":true},{"key":"one","value":"条"},{"key":"yard","value":"码"}],"product_shop_width_unit":[{"key":"cm","value":"厘米","def":true}],"product_shop_height_unit":[{"key":"cm","value":"厘米","def":true}]}
         * collection : {"collection_price_unit":[{"key":"yuan/yard","value":"元/码"},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨","def":true},{"key":"yuan/one","value":"元/条"}],"collection_width_unit":[{"key":"cm","value":"厘米","def":true}],"collection_height_unit":[{"key":"cm","value":"厘米","def":true}],"collection_freeheight_unit":[{"key":"cm","value":"厘米","def":true}],"collection_weight_unit":[{"key":"yard/kg","value":"码/公斤","def":true},{"key":"m/kg","value":"米/公斤"},{"key":"one/kg","value":"条/公斤"}],"collection_inventory_unit":[{"key":"ton","value":"吨"},{"key":"kg","value":"公斤","def":true},{"key":"one","value":"条"},{"key":"yard","value":"码"}]}
         * pattribute : {"pattribute_price_unit":[{"key":"yuan/yard","value":"元/码"},{"key":"yuan/kg","value":"元/公斤"},{"key":"yuan/ton","value":"元/吨","def":true},{"key":"yuan/one","value":"元/条"}],"pattribute_width_unit":[{"key":"cm","value":"厘米","def":true}],"pattribute_height_unit":[{"key":"cm","value":"厘米","def":true}],"pattribute_freeheight_unit":[{"key":"cm","value":"厘米","def":true}],"pattribute_weight_unit":[{"key":"yard/kg","value":"码/公斤","def":true},{"key":"m/kg","value":"米/公斤"},{"key":"one/kg","value":"条/公斤"}],"pattribute_inventory_unit":[{"key":"ton","value":"吨"},{"key":"kg","value":"公斤","def":true},{"key":"one","value":"条"},{"key":"yard","value":"码"}]}
         */

        private AllUnitBean allUnit;
        /**
         * hasNotice : true
         * notice : {"code":"3210","fontColor":"#ff0000","bgColor":"#dfdfdf","icon":"http://upload.lacecdn.com/tag/02fa169e8220d16169e448e50e85a317.png@30w_30h","msgList":["登录后使用更多功能"]}
         */

        private IndexNoticeBean indexNotice;
        /**
         * models : [{"hash":"9cda5fc0f976b7f89480920e9e624236","imageUrl":"http://tmp.lacecdn.com/beae3e60a09701f11d534b2d45d095b3.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/beae3e60a09701f11d534b2d45d095b3.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-18 08:57:42"},{"hash":"acd7233bd6405bf7b635fcbdd1fcbc49","imageUrl":"http://tmp.lacecdn.com/f7798890e15bb3721bb9ca98249f5e7d.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/f7798890e15bb3721bb9ca98249f5e7d.jpg@200w","typeName":"大边","rangeName":"测试库","ctime":"2016-08-18 00:35:33"},{"hash":"6082d335699b4eaca3a0311f9b34441e","imageUrl":"http://tmp.lacecdn.com/11ee627b0d753ddd038fa9948d3e96cf.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/11ee627b0d753ddd038fa9948d3e96cf.jpg@200w","typeName":"睫毛","rangeName":"测试库","ctime":"2016-08-17 23:53:37"},{"hash":"1816fa5ba26bd5bc47a6bf1b0040f449","imageUrl":"http://tmp.lacecdn.com/7e7dcd92b8de4bc0558830c98ab76e23.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/7e7dcd92b8de4bc0558830c98ab76e23.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-17 21:35:16"},{"hash":"97b2862b26715db33d45adaa81b3bc56","imageUrl":"http://tmp.lacecdn.com/4a8616962ecb1edc28e07fe11bb2e5d5.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/4a8616962ecb1edc28e07fe11bb2e5d5.jpg@200w","typeName":"小边","rangeName":"测试库","ctime":"2016-08-17 21:02:18"},{"hash":"5f72df2600af0e3f3dc89f5a2c8bfba9","imageUrl":"http://tmp.lacecdn.com/0f2d8a814cf122ddeb8118c618031ba1.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/0f2d8a814cf122ddeb8118c618031ba1.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-17 19:30:10"},{"hash":"435991de63fd9d259bb5db364557f7b6","imageUrl":"http://tmp.lacecdn.com/14b37f50d3ed44dd4f6bcb8ea4953792.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/14b37f50d3ed44dd4f6bcb8ea4953792.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-17 19:26:33"},{"hash":"53db22ad2845dd4bc956f4c23af082f5","imageUrl":"http://tmp.lacecdn.com/6c238df0c845ad502320d6b2804cbb1a.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/6c238df0c845ad502320d6b2804cbb1a.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-17 19:03:56"},{"hash":"aa9329c69165de1ac96a5ac31e624d60","imageUrl":"http://tmp.lacecdn.com/25ab8088f5e6d7166fa1f5c087944dfb.jpg","imagePreviewUrl":"http://tmp.lacecdn.com/25ab8088f5e6d7166fa1f5c087944dfb.jpg@200w","typeName":"面料","rangeName":"测试库","ctime":"2016-08-17 19:00:16"}]
         * pages : {"totalCount":"18876","pg":"1","pgs":"9"}
         */

        private LatestSearchBean latestSearch;
        /**
         * companyCount : 1717
         * companyCountTextOnIndex : 已入驻&lt;1717&gt;家
         * companyNews : 已有&lt;1717&gt;家企业入驻
         */

        private CompanyStatBean companyStat;
        private String offerBadage;
        private String chatBadage;
        private String scrollingSpeed;
        /**
         * title : 暂无推荐
         * topId : 0
         * topicId : 1
         * topicUrl :
         */

        private CompanyTopicBean companyTopic;
        /**
         * title : 剩余20个名额
         * listId : 1
         * items : []
         */

        private CompanyRanklistBean companyRanklist;
        /**
         * banner_id : 11
         * banner_title : 蕾丝网开启互联新时代
         * banner_type : 3
         * banner_imageurl : http://upload.lacecdn.com/banner/b3.jpg
         * banner_link : #
         * banner_desc :
         * ctime : 2016-01-13 23:13:56
         * utime : 2016-01-13 23:13:56
         * dtime :
         * status : 99
         */

        private List<BannerListBean> bannerList;
        /**
         * product_id : 356946
         * product_type : 2
         * product_price :
         * company_id : 397
         * image_id : 651306
         * product_pname : K993#
         * product_cname : 康宇花边
         * ctime : 2016-05-21 17:36:34
         * company : {"company_id":"397","company_name":"康宇花边","company_shortname":"康宇花边","company_type":"3","company_copy":"ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg","ctime":"2015-08-28 14:56:00","companyIcon":"http://upload.lacecdn.com/ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg","companyIconPreview":"http://upload.lacecdn.com/ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg@100w_100h_1o_4-2ci.png","displayFullName":"康宇花边","displayName":"康宇花边","displayShortName":"康宇花边","companyTypename":"档口","isCompany":true}
         * typeName : 大边
         * itemType : 2
         * itemTypeText : 大边
         * productUrl : http://shop.lacew.com/kangyu/product?productId=356946
         * imageUrl : http://images.lacecdn.com/5d79e1243721b23b12acb0e4e8ecd396.jpg
         * imagePreviewUrl : http://images.lacecdn.com/5d79e1243721b23b12acb0e4e8ecd396.jpg@600w_1o.jpg
         * imagePreviewUrl4List : http://images.lacecdn.com/5d79e1243721b23b12acb0e4e8ecd396.jpg@300w_1o.jpg
         * imageMd5 : 5d79e1243721b23b12acb0e4e8ecd396
         * imageId : 651306
         */

        private List<HotestProductBean> hotestProduct;
        /**
         * product_id : 400690
         * product_type : 1
         * product_price :
         * company_id : 998
         * image_id : 723318
         * product_pname : 91000X06
         * product_cname : 永泰丰
         * ctime : 2016-08-17 18:11:18
         * company : {"company_id":"998","company_name":"永泰丰花边辅料经营部","company_shortname":"永泰丰","company_type":"2","company_copy":"ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg","ctime":"2016-01-17 14:23:20","companyIcon":"http://upload.lacecdn.com/ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg","companyIconPreview":"http://upload.lacecdn.com/ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg@100w_100h_1o_4-2ci.png","displayFullName":"永泰丰花边辅料经营部","displayName":"永泰丰","displayShortName":"永泰丰","companyTypename":"贸易","isCompany":true}
         * typeName : 面料
         * imageUrl : http://images.lacecdn.com/c970093ea46f44084e12499147d01a5b.jpg
         * imagePreviewUrl : http://images.lacecdn.com/c970093ea46f44084e12499147d01a5b.jpg@600w_1o.jpg
         * imagePreviewUrl4List : http://images.lacecdn.com/c970093ea46f44084e12499147d01a5b.jpg@300w_1o.jpg
         * imageMd5 : c970093ea46f44084e12499147d01a5b
         * imageId : 723318
         */

        private List<LatestProductBean> latestProduct;
        private List<?> promotionProduct;
        /**
         * company_id : 2021
         * company_name : 梦香花边行
         * company_shortname : 梦香
         * company_type : 3
         * company_copy : ccopy/3.png
         * ctime : 昨天16:54
         * company_major : 花边，布料。
         * company_is_recommend : 0
         * company_recommend_desc :
         * company_is_corporation : 0
         * company_corporation_order : 0
         * stat_public_product : 0
         * stat_invite_used : 0
         * companyTags : [{"tag_id":"1","company_id":"","tag_category":"1","tag_image_id":"122","tag_image":"http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png","tag_title":"已认证","tag_desc":"企业已通过认证","used_count":"0","status":"99","ctime":"2015-12-09 17:07:38","utime":"2015-12-09 17:07:38","tag_imagePreview":"http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png"}]
         * companyUrl : http://shop.lacew.com/2021/company
         * company_type_text : 档口
         * extraText :
         * companyIcon : http://upload.lacecdn.com/ccopy/3.png@watermark=2&amp;type=ZmFuZ3poZW5naGVpdGk&amp;size=15&amp;text=5qKm6aaZ&amp;color=I2ZmZmZmZg%3D%3D&amp;s=0&amp;t=90&amp;p=5&amp;x=10&amp;voffset=-38
         * companyIconPreview : http://upload.lacecdn.com/ccopy/3.png@watermark=2&amp;type=ZmFuZ3poZW5naGVpdGk&amp;size=15&amp;text=5qKm6aaZ&amp;color=I2ZmZmZmZg%3D%3D&amp;s=0&amp;t=90&amp;p=5&amp;x=10&amp;voffset=-38
         * displayFullName : 梦香花边行
         * displayName : 梦香
         * displayShortName : 梦香
         * companyTypename : 档口
         * isCompany : true
         */

        private List<LatestCompanyBean> latestCompany;
        /**
         * company_id : 1380
         * company_name : 福建省长乐市佳和针织有限公司
         * company_shortname : 佳和针织
         * company_type : 1
         * company_copy : ccopy/573daf36cb3ab9852900cf92b1925a47.jpg
         * ctime : 2016-05-21
         * company_major : 花边，面料
         * company_is_recommend : 1
         * company_recommend_desc :
         * company_is_corporation : 1
         * company_corporation_order : 3040
         * companyTags : [{"tag_id":"1","company_id":"","tag_category":"1","tag_image_id":"122","tag_image":"http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png","tag_title":"已认证","tag_desc":"企业已通过认证","used_count":"0","status":"99","ctime":"2015-12-09 17:07:38","utime":"2015-12-09 17:07:38","tag_imagePreview":"http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png"},{"tag_id":"3","company_id":"","tag_category":"1","tag_image_id":"1221","tag_image":"http://upload.lacecdn.com/tag/F53DD1C981CBD2233A5B1ACDEFE70ACF.png","tag_title":"战略合作伙伴","tag_desc":"战略合作伙伴描述","used_count":"1","status":"99","ctime":"2015-12-10 15:13:33","utime":"2016-04-27 05:39:45","tag_imagePreview":"http://upload.lacecdn.com/tag/F53DD1C981CBD2233A5B1ACDEFE70ACF.png"}]
         * company_type_text : 厂家
         * companyUrl : http://shop.lacew.com/jiahe/company
         * companyIcon : http://upload.lacecdn.com/ccopy/573daf36cb3ab9852900cf92b1925a47.jpg
         * companyIconPreview : http://upload.lacecdn.com/ccopy/573daf36cb3ab9852900cf92b1925a47.jpg@100w_100h_1o_4-2ci.png
         * displayFullName : 福建省长乐市佳和针织有限公司
         * displayName : 佳和针织
         * displayShortName : 佳和针织
         * companyTypename : 厂家
         * isCompany : true
         */

        private List<CorporationCompanyBean> corporationCompany;

        public AllUnitBean getAllUnit() {
            return allUnit;
        }

        public void setAllUnit(AllUnitBean allUnit) {
            this.allUnit = allUnit;
        }

        public IndexNoticeBean getIndexNotice() {
            return indexNotice;
        }

        public void setIndexNotice(IndexNoticeBean indexNotice) {
            this.indexNotice = indexNotice;
        }

        public LatestSearchBean getLatestSearch() {
            return latestSearch;
        }

        public void setLatestSearch(LatestSearchBean latestSearch) {
            this.latestSearch = latestSearch;
        }

        public CompanyStatBean getCompanyStat() {
            return companyStat;
        }

        public void setCompanyStat(CompanyStatBean companyStat) {
            this.companyStat = companyStat;
        }

        public String getOfferBadage() {
            return offerBadage;
        }

        public void setOfferBadage(String offerBadage) {
            this.offerBadage = offerBadage;
        }

        public String getChatBadage() {
            return chatBadage;
        }

        public void setChatBadage(String chatBadage) {
            this.chatBadage = chatBadage;
        }

        public String getScrollingSpeed() {
            return scrollingSpeed;
        }

        public void setScrollingSpeed(String scrollingSpeed) {
            this.scrollingSpeed = scrollingSpeed;
        }

        public CompanyTopicBean getCompanyTopic() {
            return companyTopic;
        }

        public void setCompanyTopic(CompanyTopicBean companyTopic) {
            this.companyTopic = companyTopic;
        }

        public CompanyRanklistBean getCompanyRanklist() {
            return companyRanklist;
        }

        public void setCompanyRanklist(CompanyRanklistBean companyRanklist) {
            this.companyRanklist = companyRanklist;
        }

        public List<BannerListBean> getBannerList() {
            return bannerList;
        }

        public void setBannerList(List<BannerListBean> bannerList) {
            this.bannerList = bannerList;
        }

        public List<HotestProductBean> getHotestProduct() {
            return hotestProduct;
        }

        public void setHotestProduct(List<HotestProductBean> hotestProduct) {
            this.hotestProduct = hotestProduct;
        }

        public List<LatestProductBean> getLatestProduct() {
            return latestProduct;
        }

        public void setLatestProduct(List<LatestProductBean> latestProduct) {
            this.latestProduct = latestProduct;
        }

        public List<?> getPromotionProduct() {
            return promotionProduct;
        }

        public void setPromotionProduct(List<?> promotionProduct) {
            this.promotionProduct = promotionProduct;
        }

        public List<LatestCompanyBean> getLatestCompany() {
            return latestCompany;
        }

        public void setLatestCompany(List<LatestCompanyBean> latestCompany) {
            this.latestCompany = latestCompany;
        }

        public List<CorporationCompanyBean> getCorporationCompany() {
            return corporationCompany;
        }

        public void setCorporationCompany(List<CorporationCompanyBean> corporationCompany) {
            this.corporationCompany = corporationCompany;
        }

        public static class AllUnitBean {
            private ProductBean product;
            private ShopProductBean shopProduct;
            private CollectionBean collection;
            private PattributeBean pattribute;

            public ProductBean getProduct() {
                return product;
            }

            public void setProduct(ProductBean product) {
                this.product = product;
            }

            public ShopProductBean getShopProduct() {
                return shopProduct;
            }

            public void setShopProduct(ShopProductBean shopProduct) {
                this.shopProduct = shopProduct;
            }

            public CollectionBean getCollection() {
                return collection;
            }

            public void setCollection(CollectionBean collection) {
                this.collection = collection;
            }

            public PattributeBean getPattribute() {
                return pattribute;
            }

            public void setPattribute(PattributeBean pattribute) {
                this.pattribute = pattribute;
            }

            public static class ProductBean {
                /**
                 * key : yuan/yard
                 * value : 元/码
                 */

                private List<ProductPriceUnitBean> product_price_unit;
                /**
                 * key : yuan/kg
                 * value : 元/公斤
                 * def : true
                 */

                private List<ProductClothPriceUnitBean> product_cloth_price_unit;
                /**
                 * key : yuan/yard
                 * value : 元/码
                 * def : true
                 */

                private List<ProductProductPriceUnitBean> product_product_price_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<ProductWidthUnitBean> product_width_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<ProductHeightUnitBean> product_height_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<ProductFreeheightUnitBean> product_freeheight_unit;
                /**
                 * key : yard/kg
                 * value : 码/公斤
                 * def : true
                 */

                private List<ProductWeightUnitBean> product_weight_unit;
                /**
                 * key : ton
                 * value : 吨
                 */

                private List<ProductInventoryUnitBean> product_inventory_unit;
                /**
                 * mesh : kg
                 * value : 网眼
                 * def : true
                 */

                private List<ProductUptimeDensityUnitBean> product_uptime_density_unit;

                public List<ProductPriceUnitBean> getProduct_price_unit() {
                    return product_price_unit;
                }

                public void setProduct_price_unit(List<ProductPriceUnitBean> product_price_unit) {
                    this.product_price_unit = product_price_unit;
                }

                public List<ProductClothPriceUnitBean> getProduct_cloth_price_unit() {
                    return product_cloth_price_unit;
                }

                public void setProduct_cloth_price_unit(List<ProductClothPriceUnitBean> product_cloth_price_unit) {
                    this.product_cloth_price_unit = product_cloth_price_unit;
                }

                public List<ProductProductPriceUnitBean> getProduct_product_price_unit() {
                    return product_product_price_unit;
                }

                public void setProduct_product_price_unit(List<ProductProductPriceUnitBean> product_product_price_unit) {
                    this.product_product_price_unit = product_product_price_unit;
                }

                public List<ProductWidthUnitBean> getProduct_width_unit() {
                    return product_width_unit;
                }

                public void setProduct_width_unit(List<ProductWidthUnitBean> product_width_unit) {
                    this.product_width_unit = product_width_unit;
                }

                public List<ProductHeightUnitBean> getProduct_height_unit() {
                    return product_height_unit;
                }

                public void setProduct_height_unit(List<ProductHeightUnitBean> product_height_unit) {
                    this.product_height_unit = product_height_unit;
                }

                public List<ProductFreeheightUnitBean> getProduct_freeheight_unit() {
                    return product_freeheight_unit;
                }

                public void setProduct_freeheight_unit(List<ProductFreeheightUnitBean> product_freeheight_unit) {
                    this.product_freeheight_unit = product_freeheight_unit;
                }

                public List<ProductWeightUnitBean> getProduct_weight_unit() {
                    return product_weight_unit;
                }

                public void setProduct_weight_unit(List<ProductWeightUnitBean> product_weight_unit) {
                    this.product_weight_unit = product_weight_unit;
                }

                public List<ProductInventoryUnitBean> getProduct_inventory_unit() {
                    return product_inventory_unit;
                }

                public void setProduct_inventory_unit(List<ProductInventoryUnitBean> product_inventory_unit) {
                    this.product_inventory_unit = product_inventory_unit;
                }

                public List<ProductUptimeDensityUnitBean> getProduct_uptime_density_unit() {
                    return product_uptime_density_unit;
                }

                public void setProduct_uptime_density_unit(List<ProductUptimeDensityUnitBean> product_uptime_density_unit) {
                    this.product_uptime_density_unit = product_uptime_density_unit;
                }

                public static class ProductPriceUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class ProductClothPriceUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductProductPriceUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductWidthUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductHeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductFreeheightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductWeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductInventoryUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class ProductUptimeDensityUnitBean {
                    private String mesh;
                    private String value;
                    private boolean def;

                    public String getMesh() {
                        return mesh;
                    }

                    public void setMesh(String mesh) {
                        this.mesh = mesh;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }
            }

            public static class ShopProductBean {
                /**
                 * key : yuan/yard
                 * value : 元/码
                 */

                private List<ProductShopPriceOriginUnitBean> product_shop_price_origin_unit;
                /**
                 * key : yuan/yard
                 * value : 元/码
                 */

                private List<ProductShopPriceOnSaleUnitBean> product_shop_price_on_sale_unit;
                /**
                 * key : ton
                 * value : 吨
                 */

                private List<ProductShopInventoryUnitBean> product_shop_inventory_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<ProductShopWidthUnitBean> product_shop_width_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<ProductShopHeightUnitBean> product_shop_height_unit;

                public List<ProductShopPriceOriginUnitBean> getProduct_shop_price_origin_unit() {
                    return product_shop_price_origin_unit;
                }

                public void setProduct_shop_price_origin_unit(List<ProductShopPriceOriginUnitBean> product_shop_price_origin_unit) {
                    this.product_shop_price_origin_unit = product_shop_price_origin_unit;
                }

                public List<ProductShopPriceOnSaleUnitBean> getProduct_shop_price_on_sale_unit() {
                    return product_shop_price_on_sale_unit;
                }

                public void setProduct_shop_price_on_sale_unit(List<ProductShopPriceOnSaleUnitBean> product_shop_price_on_sale_unit) {
                    this.product_shop_price_on_sale_unit = product_shop_price_on_sale_unit;
                }

                public List<ProductShopInventoryUnitBean> getProduct_shop_inventory_unit() {
                    return product_shop_inventory_unit;
                }

                public void setProduct_shop_inventory_unit(List<ProductShopInventoryUnitBean> product_shop_inventory_unit) {
                    this.product_shop_inventory_unit = product_shop_inventory_unit;
                }

                public List<ProductShopWidthUnitBean> getProduct_shop_width_unit() {
                    return product_shop_width_unit;
                }

                public void setProduct_shop_width_unit(List<ProductShopWidthUnitBean> product_shop_width_unit) {
                    this.product_shop_width_unit = product_shop_width_unit;
                }

                public List<ProductShopHeightUnitBean> getProduct_shop_height_unit() {
                    return product_shop_height_unit;
                }

                public void setProduct_shop_height_unit(List<ProductShopHeightUnitBean> product_shop_height_unit) {
                    this.product_shop_height_unit = product_shop_height_unit;
                }

                public static class ProductShopPriceOriginUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class ProductShopPriceOnSaleUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class ProductShopInventoryUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class ProductShopWidthUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class ProductShopHeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }
            }

            public static class CollectionBean {
                /**
                 * key : yuan/yard
                 * value : 元/码
                 */

                private List<CollectionPriceUnitBean> collection_price_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<CollectionWidthUnitBean> collection_width_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<CollectionHeightUnitBean> collection_height_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<CollectionFreeheightUnitBean> collection_freeheight_unit;
                /**
                 * key : yard/kg
                 * value : 码/公斤
                 * def : true
                 */

                private List<CollectionWeightUnitBean> collection_weight_unit;
                /**
                 * key : ton
                 * value : 吨
                 */

                private List<CollectionInventoryUnitBean> collection_inventory_unit;

                public List<CollectionPriceUnitBean> getCollection_price_unit() {
                    return collection_price_unit;
                }

                public void setCollection_price_unit(List<CollectionPriceUnitBean> collection_price_unit) {
                    this.collection_price_unit = collection_price_unit;
                }

                public List<CollectionWidthUnitBean> getCollection_width_unit() {
                    return collection_width_unit;
                }

                public void setCollection_width_unit(List<CollectionWidthUnitBean> collection_width_unit) {
                    this.collection_width_unit = collection_width_unit;
                }

                public List<CollectionHeightUnitBean> getCollection_height_unit() {
                    return collection_height_unit;
                }

                public void setCollection_height_unit(List<CollectionHeightUnitBean> collection_height_unit) {
                    this.collection_height_unit = collection_height_unit;
                }

                public List<CollectionFreeheightUnitBean> getCollection_freeheight_unit() {
                    return collection_freeheight_unit;
                }

                public void setCollection_freeheight_unit(List<CollectionFreeheightUnitBean> collection_freeheight_unit) {
                    this.collection_freeheight_unit = collection_freeheight_unit;
                }

                public List<CollectionWeightUnitBean> getCollection_weight_unit() {
                    return collection_weight_unit;
                }

                public void setCollection_weight_unit(List<CollectionWeightUnitBean> collection_weight_unit) {
                    this.collection_weight_unit = collection_weight_unit;
                }

                public List<CollectionInventoryUnitBean> getCollection_inventory_unit() {
                    return collection_inventory_unit;
                }

                public void setCollection_inventory_unit(List<CollectionInventoryUnitBean> collection_inventory_unit) {
                    this.collection_inventory_unit = collection_inventory_unit;
                }

                public static class CollectionPriceUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class CollectionWidthUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class CollectionHeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class CollectionFreeheightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class CollectionWeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class CollectionInventoryUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }
            }

            public static class PattributeBean {
                /**
                 * key : yuan/yard
                 * value : 元/码
                 */

                private List<PattributePriceUnitBean> pattribute_price_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<PattributeWidthUnitBean> pattribute_width_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<PattributeHeightUnitBean> pattribute_height_unit;
                /**
                 * key : cm
                 * value : 厘米
                 * def : true
                 */

                private List<PattributeFreeheightUnitBean> pattribute_freeheight_unit;
                /**
                 * key : yard/kg
                 * value : 码/公斤
                 * def : true
                 */

                private List<PattributeWeightUnitBean> pattribute_weight_unit;
                /**
                 * key : ton
                 * value : 吨
                 */

                private List<PattributeInventoryUnitBean> pattribute_inventory_unit;

                public List<PattributePriceUnitBean> getPattribute_price_unit() {
                    return pattribute_price_unit;
                }

                public void setPattribute_price_unit(List<PattributePriceUnitBean> pattribute_price_unit) {
                    this.pattribute_price_unit = pattribute_price_unit;
                }

                public List<PattributeWidthUnitBean> getPattribute_width_unit() {
                    return pattribute_width_unit;
                }

                public void setPattribute_width_unit(List<PattributeWidthUnitBean> pattribute_width_unit) {
                    this.pattribute_width_unit = pattribute_width_unit;
                }

                public List<PattributeHeightUnitBean> getPattribute_height_unit() {
                    return pattribute_height_unit;
                }

                public void setPattribute_height_unit(List<PattributeHeightUnitBean> pattribute_height_unit) {
                    this.pattribute_height_unit = pattribute_height_unit;
                }

                public List<PattributeFreeheightUnitBean> getPattribute_freeheight_unit() {
                    return pattribute_freeheight_unit;
                }

                public void setPattribute_freeheight_unit(List<PattributeFreeheightUnitBean> pattribute_freeheight_unit) {
                    this.pattribute_freeheight_unit = pattribute_freeheight_unit;
                }

                public List<PattributeWeightUnitBean> getPattribute_weight_unit() {
                    return pattribute_weight_unit;
                }

                public void setPattribute_weight_unit(List<PattributeWeightUnitBean> pattribute_weight_unit) {
                    this.pattribute_weight_unit = pattribute_weight_unit;
                }

                public List<PattributeInventoryUnitBean> getPattribute_inventory_unit() {
                    return pattribute_inventory_unit;
                }

                public void setPattribute_inventory_unit(List<PattributeInventoryUnitBean> pattribute_inventory_unit) {
                    this.pattribute_inventory_unit = pattribute_inventory_unit;
                }

                public static class PattributePriceUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class PattributeWidthUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class PattributeHeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class PattributeFreeheightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class PattributeWeightUnitBean {
                    private String key;
                    private String value;
                    private boolean def;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public boolean isDef() {
                        return def;
                    }

                    public void setDef(boolean def) {
                        this.def = def;
                    }
                }

                public static class PattributeInventoryUnitBean {
                    private String key;
                    private String value;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }
            }
        }

        public static class IndexNoticeBean {
            private boolean hasNotice;
            /**
             * code : 3210
             * fontColor : #ff0000
             * bgColor : #dfdfdf
             * icon : http://upload.lacecdn.com/tag/02fa169e8220d16169e448e50e85a317.png@30w_30h
             * msgList : ["登录后使用更多功能"]
             */

            private NoticeBean notice;

            public boolean isHasNotice() {
                return hasNotice;
            }

            public void setHasNotice(boolean hasNotice) {
                this.hasNotice = hasNotice;
            }

            public NoticeBean getNotice() {
                return notice;
            }

            public void setNotice(NoticeBean notice) {
                this.notice = notice;
            }

            public static class NoticeBean {
                private String code;
                private String fontColor;
                private String bgColor;
                private String icon;
                private List<String> msgList;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getFontColor() {
                    return fontColor;
                }

                public void setFontColor(String fontColor) {
                    this.fontColor = fontColor;
                }

                public String getBgColor() {
                    return bgColor;
                }

                public void setBgColor(String bgColor) {
                    this.bgColor = bgColor;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public List<String> getMsgList() {
                    return msgList;
                }

                public void setMsgList(List<String> msgList) {
                    this.msgList = msgList;
                }
            }
        }

        public static class LatestSearchBean {
            /**
             * totalCount : 18876
             * pg : 1
             * pgs : 9
             */

            private PagesBean pages;
            /**
             * hash : 9cda5fc0f976b7f89480920e9e624236
             * imageUrl : http://tmp.lacecdn.com/beae3e60a09701f11d534b2d45d095b3.jpg
             * imagePreviewUrl : http://tmp.lacecdn.com/beae3e60a09701f11d534b2d45d095b3.jpg@200w
             * typeName : 面料
             * rangeName : 测试库
             * ctime : 2016-08-18 08:57:42
             */

            private List<ModelsBean> models;

            public PagesBean getPages() {
                return pages;
            }

            public void setPages(PagesBean pages) {
                this.pages = pages;
            }

            public List<ModelsBean> getModels() {
                return models;
            }

            public void setModels(List<ModelsBean> models) {
                this.models = models;
            }

            public static class PagesBean {
                private String totalCount;
                private String pg;
                private String pgs;

                public String getTotalCount() {
                    return totalCount;
                }

                public void setTotalCount(String totalCount) {
                    this.totalCount = totalCount;
                }

                public String getPg() {
                    return pg;
                }

                public void setPg(String pg) {
                    this.pg = pg;
                }

                public String getPgs() {
                    return pgs;
                }

                public void setPgs(String pgs) {
                    this.pgs = pgs;
                }
            }

            public static class ModelsBean {
                private String hash;
                private String imageUrl;
                private String imagePreviewUrl;
                private String typeName;
                private String rangeName;
                private String ctime;

                public String getHash() {
                    return hash;
                }

                public void setHash(String hash) {
                    this.hash = hash;
                }

                public String getImageUrl() {
                    return imageUrl;
                }

                public void setImageUrl(String imageUrl) {
                    this.imageUrl = imageUrl;
                }

                public String getImagePreviewUrl() {
                    return imagePreviewUrl;
                }

                public void setImagePreviewUrl(String imagePreviewUrl) {
                    this.imagePreviewUrl = imagePreviewUrl;
                }

                public String getTypeName() {
                    return typeName;
                }

                public void setTypeName(String typeName) {
                    this.typeName = typeName;
                }

                public String getRangeName() {
                    return rangeName;
                }

                public void setRangeName(String rangeName) {
                    this.rangeName = rangeName;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }
            }
        }

        public static class CompanyStatBean {
            private String companyCount;
            private String companyCountTextOnIndex;
            private String companyNews;

            public String getCompanyCount() {
                return companyCount;
            }

            public void setCompanyCount(String companyCount) {
                this.companyCount = companyCount;
            }

            public String getCompanyCountTextOnIndex() {
                return companyCountTextOnIndex;
            }

            public void setCompanyCountTextOnIndex(String companyCountTextOnIndex) {
                this.companyCountTextOnIndex = companyCountTextOnIndex;
            }

            public String getCompanyNews() {
                return companyNews;
            }

            public void setCompanyNews(String companyNews) {
                this.companyNews = companyNews;
            }
        }

        public static class CompanyTopicBean {
            private String title;
            private String topId;
            private String topicId;
            private String topicUrl;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTopId() {
                return topId;
            }

            public void setTopId(String topId) {
                this.topId = topId;
            }

            public String getTopicId() {
                return topicId;
            }

            public void setTopicId(String topicId) {
                this.topicId = topicId;
            }

            public String getTopicUrl() {
                return topicUrl;
            }

            public void setTopicUrl(String topicUrl) {
                this.topicUrl = topicUrl;
            }
        }

        public static class CompanyRanklistBean {
            private String title;
            private String listId;
            private List<?> items;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getListId() {
                return listId;
            }

            public void setListId(String listId) {
                this.listId = listId;
            }

            public List<?> getItems() {
                return items;
            }

            public void setItems(List<?> items) {
                this.items = items;
            }
        }

        public static class BannerListBean {
            private String banner_id;
            private String banner_title;
            private String banner_type;
            private String banner_imageurl;
            private String banner_link;
            private String banner_desc;
            private String ctime;
            private String utime;
            private String dtime;
            private String status;

            public String getBanner_id() {
                return banner_id;
            }

            public void setBanner_id(String banner_id) {
                this.banner_id = banner_id;
            }

            public String getBanner_title() {
                return banner_title;
            }

            public void setBanner_title(String banner_title) {
                this.banner_title = banner_title;
            }

            public String getBanner_type() {
                return banner_type;
            }

            public void setBanner_type(String banner_type) {
                this.banner_type = banner_type;
            }

            public String getBanner_imageurl() {
                return banner_imageurl;
            }

            public void setBanner_imageurl(String banner_imageurl) {
                this.banner_imageurl = banner_imageurl;
            }

            public String getBanner_link() {
                return banner_link;
            }

            public void setBanner_link(String banner_link) {
                this.banner_link = banner_link;
            }

            public String getBanner_desc() {
                return banner_desc;
            }

            public void setBanner_desc(String banner_desc) {
                this.banner_desc = banner_desc;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getUtime() {
                return utime;
            }

            public void setUtime(String utime) {
                this.utime = utime;
            }

            public String getDtime() {
                return dtime;
            }

            public void setDtime(String dtime) {
                this.dtime = dtime;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }

        public static class HotestProductBean {
            private String product_id;
            private String product_type;
            private String product_price;
            private String company_id;
            private String image_id;
            private String product_pname;
            private String product_cname;
            private String ctime;
            /**
             * company_id : 397
             * company_name : 康宇花边
             * company_shortname : 康宇花边
             * company_type : 3
             * company_copy : ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg
             * ctime : 2015-08-28 14:56:00
             * companyIcon : http://upload.lacecdn.com/ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg
             * companyIconPreview : http://upload.lacecdn.com/ccopy/4f1552f5fbbe5692c3660b1cb2863ff5.jpg@100w_100h_1o_4-2ci.png
             * displayFullName : 康宇花边
             * displayName : 康宇花边
             * displayShortName : 康宇花边
             * companyTypename : 档口
             * isCompany : true
             */

            private CompanyBean company;
            private String typeName;
            private String itemType;
            private String itemTypeText;
            private String productUrl;
            private String imageUrl;
            private String imagePreviewUrl;
            private String imagePreviewUrl4List;
            private String imageMd5;
            private String imageId;

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getProduct_type() {
                return product_type;
            }

            public void setProduct_type(String product_type) {
                this.product_type = product_type;
            }

            public String getProduct_price() {
                return product_price;
            }

            public void setProduct_price(String product_price) {
                this.product_price = product_price;
            }

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }

            public String getImage_id() {
                return image_id;
            }

            public void setImage_id(String image_id) {
                this.image_id = image_id;
            }

            public String getProduct_pname() {
                return product_pname;
            }

            public void setProduct_pname(String product_pname) {
                this.product_pname = product_pname;
            }

            public String getProduct_cname() {
                return product_cname;
            }

            public void setProduct_cname(String product_cname) {
                this.product_cname = product_cname;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public CompanyBean getCompany() {
                return company;
            }

            public void setCompany(CompanyBean company) {
                this.company = company;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public String getItemTypeText() {
                return itemTypeText;
            }

            public void setItemTypeText(String itemTypeText) {
                this.itemTypeText = itemTypeText;
            }

            public String getProductUrl() {
                return productUrl;
            }

            public void setProductUrl(String productUrl) {
                this.productUrl = productUrl;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getImagePreviewUrl() {
                return imagePreviewUrl;
            }

            public void setImagePreviewUrl(String imagePreviewUrl) {
                this.imagePreviewUrl = imagePreviewUrl;
            }

            public String getImagePreviewUrl4List() {
                return imagePreviewUrl4List;
            }

            public void setImagePreviewUrl4List(String imagePreviewUrl4List) {
                this.imagePreviewUrl4List = imagePreviewUrl4List;
            }

            public String getImageMd5() {
                return imageMd5;
            }

            public void setImageMd5(String imageMd5) {
                this.imageMd5 = imageMd5;
            }

            public String getImageId() {
                return imageId;
            }

            public void setImageId(String imageId) {
                this.imageId = imageId;
            }

            public static class CompanyBean {
                private String company_id;
                private String company_name;
                private String company_shortname;
                private String company_type;
                private String company_copy;
                private String ctime;
                private String companyIcon;
                private String companyIconPreview;
                private String displayFullName;
                private String displayName;
                private String displayShortName;
                private String companyTypename;
                private boolean isCompany;

                public String getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(String company_id) {
                    this.company_id = company_id;
                }

                public String getCompany_name() {
                    return company_name;
                }

                public void setCompany_name(String company_name) {
                    this.company_name = company_name;
                }

                public String getCompany_shortname() {
                    return company_shortname;
                }

                public void setCompany_shortname(String company_shortname) {
                    this.company_shortname = company_shortname;
                }

                public String getCompany_type() {
                    return company_type;
                }

                public void setCompany_type(String company_type) {
                    this.company_type = company_type;
                }

                public String getCompany_copy() {
                    return company_copy;
                }

                public void setCompany_copy(String company_copy) {
                    this.company_copy = company_copy;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public String getCompanyIcon() {
                    return companyIcon;
                }

                public void setCompanyIcon(String companyIcon) {
                    this.companyIcon = companyIcon;
                }

                public String getCompanyIconPreview() {
                    return companyIconPreview;
                }

                public void setCompanyIconPreview(String companyIconPreview) {
                    this.companyIconPreview = companyIconPreview;
                }

                public String getDisplayFullName() {
                    return displayFullName;
                }

                public void setDisplayFullName(String displayFullName) {
                    this.displayFullName = displayFullName;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public String getDisplayShortName() {
                    return displayShortName;
                }

                public void setDisplayShortName(String displayShortName) {
                    this.displayShortName = displayShortName;
                }

                public String getCompanyTypename() {
                    return companyTypename;
                }

                public void setCompanyTypename(String companyTypename) {
                    this.companyTypename = companyTypename;
                }

                public boolean isIsCompany() {
                    return isCompany;
                }

                public void setIsCompany(boolean isCompany) {
                    this.isCompany = isCompany;
                }
            }
        }

        public static class LatestProductBean {
            private String product_id;
            private String product_type;
            private String product_price;
            private String company_id;
            private String image_id;
            private String product_pname;
            private String product_cname;
            private String ctime;

            @Override
            public String toString() {
                return "LatestProductBean{" +
                        "product_id='" + product_id + '\'' +
                        ", product_type='" + product_type + '\'' +
                        ", product_price='" + product_price + '\'' +
                        ", company_id='" + company_id + '\'' +
                        ", image_id='" + image_id + '\'' +
                        ", product_pname='" + product_pname + '\'' +
                        ", product_cname='" + product_cname + '\'' +
                        ", ctime='" + ctime + '\'' +
                        ", company=" + company +
                        ", typeName='" + typeName + '\'' +
                        ", imageUrl='" + imageUrl + '\'' +
                        ", imagePreviewUrl='" + imagePreviewUrl + '\'' +
                        ", imagePreviewUrl4List='" + imagePreviewUrl4List + '\'' +
                        ", imageMd5='" + imageMd5 + '\'' +
                        ", imageId='" + imageId + '\'' +
                        '}';
            }

            /**
             * company_id : 998
             * company_name : 永泰丰花边辅料经营部
             * company_shortname : 永泰丰
             * company_type : 2
             * company_copy : ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg
             * ctime : 2016-01-17 14:23:20
             * companyIcon : http://upload.lacecdn.com/ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg
             * companyIconPreview : http://upload.lacecdn.com/ccopy/a1119ef74f31e2bc3b413ce15ce1e7a1.jpg@100w_100h_1o_4-2ci.png
             * displayFullName : 永泰丰花边辅料经营部
             * displayName : 永泰丰
             * displayShortName : 永泰丰
             * companyTypename : 贸易
             * isCompany : true
             */

            private CompanyBean company;
            private String typeName;
            private String imageUrl;
            private String imagePreviewUrl;
            private String imagePreviewUrl4List;
            private String imageMd5;
            private String imageId;

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getProduct_type() {
                return product_type;
            }

            public void setProduct_type(String product_type) {
                this.product_type = product_type;
            }

            public String getProduct_price() {
                return product_price;
            }

            public void setProduct_price(String product_price) {
                this.product_price = product_price;
            }

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }

            public String getImage_id() {
                return image_id;
            }

            public void setImage_id(String image_id) {
                this.image_id = image_id;
            }

            public String getProduct_pname() {
                return product_pname;
            }

            public void setProduct_pname(String product_pname) {
                this.product_pname = product_pname;
            }

            public String getProduct_cname() {
                return product_cname;
            }

            public void setProduct_cname(String product_cname) {
                this.product_cname = product_cname;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public CompanyBean getCompany() {
                return company;
            }

            public void setCompany(CompanyBean company) {
                this.company = company;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getImagePreviewUrl() {
                return imagePreviewUrl;
            }

            public void setImagePreviewUrl(String imagePreviewUrl) {
                this.imagePreviewUrl = imagePreviewUrl;
            }

            public String getImagePreviewUrl4List() {
                return imagePreviewUrl4List;
            }

            public void setImagePreviewUrl4List(String imagePreviewUrl4List) {
                this.imagePreviewUrl4List = imagePreviewUrl4List;
            }

            public String getImageMd5() {
                return imageMd5;
            }

            public void setImageMd5(String imageMd5) {
                this.imageMd5 = imageMd5;
            }

            public String getImageId() {
                return imageId;
            }

            public void setImageId(String imageId) {
                this.imageId = imageId;
            }

            public static class CompanyBean {
                private String company_id;
                private String company_name;
                private String company_shortname;
                private String company_type;
                private String company_copy;
                private String ctime;
                private String companyIcon;
                private String companyIconPreview;
                private String displayFullName;
                private String displayName;
                private String displayShortName;
                private String companyTypename;
                private boolean isCompany;

                public String getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(String company_id) {
                    this.company_id = company_id;
                }

                public String getCompany_name() {
                    return company_name;
                }

                public void setCompany_name(String company_name) {
                    this.company_name = company_name;
                }

                public String getCompany_shortname() {
                    return company_shortname;
                }

                public void setCompany_shortname(String company_shortname) {
                    this.company_shortname = company_shortname;
                }

                public String getCompany_type() {
                    return company_type;
                }

                public void setCompany_type(String company_type) {
                    this.company_type = company_type;
                }

                public String getCompany_copy() {
                    return company_copy;
                }

                public void setCompany_copy(String company_copy) {
                    this.company_copy = company_copy;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public String getCompanyIcon() {
                    return companyIcon;
                }

                public void setCompanyIcon(String companyIcon) {
                    this.companyIcon = companyIcon;
                }

                public String getCompanyIconPreview() {
                    return companyIconPreview;
                }

                public void setCompanyIconPreview(String companyIconPreview) {
                    this.companyIconPreview = companyIconPreview;
                }

                public String getDisplayFullName() {
                    return displayFullName;
                }

                public void setDisplayFullName(String displayFullName) {
                    this.displayFullName = displayFullName;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public String getDisplayShortName() {
                    return displayShortName;
                }

                public void setDisplayShortName(String displayShortName) {
                    this.displayShortName = displayShortName;
                }

                public String getCompanyTypename() {
                    return companyTypename;
                }

                public void setCompanyTypename(String companyTypename) {
                    this.companyTypename = companyTypename;
                }

                public boolean isIsCompany() {
                    return isCompany;
                }

                public void setIsCompany(boolean isCompany) {
                    this.isCompany = isCompany;
                }
            }
        }

        public static class LatestCompanyBean {
            private String company_id;
            private String company_name;
            private String company_shortname;
            private String company_type;
            private String company_copy;
            private String ctime;
            private String company_major;
            private String company_is_recommend;
            private String company_recommend_desc;
            private String company_is_corporation;
            private String company_corporation_order;
            private String stat_public_product;
            private String stat_invite_used;
            private String companyUrl;
            private String company_type_text;
            private String extraText;
            private String companyIcon;
            private String companyIconPreview;
            private String displayFullName;
            private String displayName;
            private String displayShortName;
            private String companyTypename;
            private boolean isCompany;
            /**
             * tag_id : 1
             * company_id :
             * tag_category : 1
             * tag_image_id : 122
             * tag_image : http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png
             * tag_title : 已认证
             * tag_desc : 企业已通过认证
             * used_count : 0
             * status : 99
             * ctime : 2015-12-09 17:07:38
             * utime : 2015-12-09 17:07:38
             * tag_imagePreview : http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png
             */

            private List<CompanyTagsBean> companyTags;

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }

            public String getCompany_name() {
                return company_name;
            }

            public void setCompany_name(String company_name) {
                this.company_name = company_name;
            }

            public String getCompany_shortname() {
                return company_shortname;
            }

            public void setCompany_shortname(String company_shortname) {
                this.company_shortname = company_shortname;
            }

            public String getCompany_type() {
                return company_type;
            }

            public void setCompany_type(String company_type) {
                this.company_type = company_type;
            }

            public String getCompany_copy() {
                return company_copy;
            }

            public void setCompany_copy(String company_copy) {
                this.company_copy = company_copy;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getCompany_major() {
                return company_major;
            }

            public void setCompany_major(String company_major) {
                this.company_major = company_major;
            }

            public String getCompany_is_recommend() {
                return company_is_recommend;
            }

            public void setCompany_is_recommend(String company_is_recommend) {
                this.company_is_recommend = company_is_recommend;
            }

            public String getCompany_recommend_desc() {
                return company_recommend_desc;
            }

            public void setCompany_recommend_desc(String company_recommend_desc) {
                this.company_recommend_desc = company_recommend_desc;
            }

            public String getCompany_is_corporation() {
                return company_is_corporation;
            }

            public void setCompany_is_corporation(String company_is_corporation) {
                this.company_is_corporation = company_is_corporation;
            }

            public String getCompany_corporation_order() {
                return company_corporation_order;
            }

            public void setCompany_corporation_order(String company_corporation_order) {
                this.company_corporation_order = company_corporation_order;
            }

            public String getStat_public_product() {
                return stat_public_product;
            }

            public void setStat_public_product(String stat_public_product) {
                this.stat_public_product = stat_public_product;
            }

            public String getStat_invite_used() {
                return stat_invite_used;
            }

            public void setStat_invite_used(String stat_invite_used) {
                this.stat_invite_used = stat_invite_used;
            }

            public String getCompanyUrl() {
                return companyUrl;
            }

            public void setCompanyUrl(String companyUrl) {
                this.companyUrl = companyUrl;
            }

            public String getCompany_type_text() {
                return company_type_text;
            }

            public void setCompany_type_text(String company_type_text) {
                this.company_type_text = company_type_text;
            }

            public String getExtraText() {
                return extraText;
            }

            public void setExtraText(String extraText) {
                this.extraText = extraText;
            }

            public String getCompanyIcon() {
                return companyIcon;
            }

            public void setCompanyIcon(String companyIcon) {
                this.companyIcon = companyIcon;
            }

            public String getCompanyIconPreview() {
                return companyIconPreview;
            }

            public void setCompanyIconPreview(String companyIconPreview) {
                this.companyIconPreview = companyIconPreview;
            }

            public String getDisplayFullName() {
                return displayFullName;
            }

            public void setDisplayFullName(String displayFullName) {
                this.displayFullName = displayFullName;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public String getDisplayShortName() {
                return displayShortName;
            }

            public void setDisplayShortName(String displayShortName) {
                this.displayShortName = displayShortName;
            }

            public String getCompanyTypename() {
                return companyTypename;
            }

            public void setCompanyTypename(String companyTypename) {
                this.companyTypename = companyTypename;
            }

            public boolean isIsCompany() {
                return isCompany;
            }

            public void setIsCompany(boolean isCompany) {
                this.isCompany = isCompany;
            }

            public List<CompanyTagsBean> getCompanyTags() {
                return companyTags;
            }

            public void setCompanyTags(List<CompanyTagsBean> companyTags) {
                this.companyTags = companyTags;
            }

            public static class CompanyTagsBean {
                private String tag_id;
                private String company_id;
                private String tag_category;
                private String tag_image_id;
                private String tag_image;
                private String tag_title;
                private String tag_desc;
                private String used_count;
                private String status;
                private String ctime;
                private String utime;
                private String tag_imagePreview;

                public String getTag_id() {
                    return tag_id;
                }

                public void setTag_id(String tag_id) {
                    this.tag_id = tag_id;
                }

                public String getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(String company_id) {
                    this.company_id = company_id;
                }

                public String getTag_category() {
                    return tag_category;
                }

                public void setTag_category(String tag_category) {
                    this.tag_category = tag_category;
                }

                public String getTag_image_id() {
                    return tag_image_id;
                }

                public void setTag_image_id(String tag_image_id) {
                    this.tag_image_id = tag_image_id;
                }

                public String getTag_image() {
                    return tag_image;
                }

                public void setTag_image(String tag_image) {
                    this.tag_image = tag_image;
                }

                public String getTag_title() {
                    return tag_title;
                }

                public void setTag_title(String tag_title) {
                    this.tag_title = tag_title;
                }

                public String getTag_desc() {
                    return tag_desc;
                }

                public void setTag_desc(String tag_desc) {
                    this.tag_desc = tag_desc;
                }

                public String getUsed_count() {
                    return used_count;
                }

                public void setUsed_count(String used_count) {
                    this.used_count = used_count;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public String getUtime() {
                    return utime;
                }

                public void setUtime(String utime) {
                    this.utime = utime;
                }

                public String getTag_imagePreview() {
                    return tag_imagePreview;
                }

                public void setTag_imagePreview(String tag_imagePreview) {
                    this.tag_imagePreview = tag_imagePreview;
                }
            }
        }

        public static class CorporationCompanyBean {
            private String company_id;
            private String company_name;
            private String company_shortname;
            private String company_type;
            private String company_copy;
            private String ctime;
            private String company_major;
            private String company_is_recommend;
            private String company_recommend_desc;
            private String company_is_corporation;
            private String company_corporation_order;
            private String company_type_text;
            private String companyUrl;
            private String companyIcon;
            private String companyIconPreview;
            private String displayFullName;
            private String displayName;
            private String displayShortName;
            private String companyTypename;
            private boolean isCompany;

            @Override
            public String toString() {
                return "CorporationCompanyBean{" +
                        "company_id='" + company_id + '\'' +
                        ", company_name='" + company_name + '\'' +
                        ", company_shortname='" + company_shortname + '\'' +
                        ", company_type='" + company_type + '\'' +
                        ", company_copy='" + company_copy + '\'' +
                        ", ctime='" + ctime + '\'' +
                        ", company_major='" + company_major + '\'' +
                        ", company_is_recommend='" + company_is_recommend + '\'' +
                        ", company_recommend_desc='" + company_recommend_desc + '\'' +
                        ", company_is_corporation='" + company_is_corporation + '\'' +
                        ", company_corporation_order='" + company_corporation_order + '\'' +
                        ", company_type_text='" + company_type_text + '\'' +
                        ", companyUrl='" + companyUrl + '\'' +
                        ", companyIcon='" + companyIcon + '\'' +
                        ", companyIconPreview='" + companyIconPreview + '\'' +
                        ", displayFullName='" + displayFullName + '\'' +
                        ", displayName='" + displayName + '\'' +
                        ", displayShortName='" + displayShortName + '\'' +
                        ", companyTypename='" + companyTypename + '\'' +
                        ", isCompany=" + isCompany +
                        ", companyTags=" + companyTags +
                        '}';
            }

            /**
             * tag_id : 1
             * company_id :
             * tag_category : 1
             * tag_image_id : 122
             * tag_image : http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png
             * tag_title : 已认证
             * tag_desc : 企业已通过认证
             * used_count : 0
             * status : 99
             * ctime : 2015-12-09 17:07:38
             * utime : 2015-12-09 17:07:38
             * tag_imagePreview : http://upload.lacecdn.com/tag/43936876505b967f8d2339659f46a2cc.png
             */

            private List<CompanyTagsBean> companyTags;

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }

            public String getCompany_name() {
                return company_name;
            }

            public void setCompany_name(String company_name) {
                this.company_name = company_name;
            }

            public String getCompany_shortname() {
                return company_shortname;
            }

            public void setCompany_shortname(String company_shortname) {
                this.company_shortname = company_shortname;
            }

            public String getCompany_type() {
                return company_type;
            }

            public void setCompany_type(String company_type) {
                this.company_type = company_type;
            }

            public String getCompany_copy() {
                return company_copy;
            }

            public void setCompany_copy(String company_copy) {
                this.company_copy = company_copy;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getCompany_major() {
                return company_major;
            }

            public void setCompany_major(String company_major) {
                this.company_major = company_major;
            }

            public String getCompany_is_recommend() {
                return company_is_recommend;
            }

            public void setCompany_is_recommend(String company_is_recommend) {
                this.company_is_recommend = company_is_recommend;
            }

            public String getCompany_recommend_desc() {
                return company_recommend_desc;
            }

            public void setCompany_recommend_desc(String company_recommend_desc) {
                this.company_recommend_desc = company_recommend_desc;
            }

            public String getCompany_is_corporation() {
                return company_is_corporation;
            }

            public void setCompany_is_corporation(String company_is_corporation) {
                this.company_is_corporation = company_is_corporation;
            }

            public String getCompany_corporation_order() {
                return company_corporation_order;
            }

            public void setCompany_corporation_order(String company_corporation_order) {
                this.company_corporation_order = company_corporation_order;
            }

            public String getCompany_type_text() {
                return company_type_text;
            }

            public void setCompany_type_text(String company_type_text) {
                this.company_type_text = company_type_text;
            }

            public String getCompanyUrl() {
                return companyUrl;
            }

            public void setCompanyUrl(String companyUrl) {
                this.companyUrl = companyUrl;
            }

            public String getCompanyIcon() {
                return companyIcon;
            }

            public void setCompanyIcon(String companyIcon) {
                this.companyIcon = companyIcon;
            }

            public String getCompanyIconPreview() {
                return companyIconPreview;
            }

            public void setCompanyIconPreview(String companyIconPreview) {
                this.companyIconPreview = companyIconPreview;
            }

            public String getDisplayFullName() {
                return displayFullName;
            }

            public void setDisplayFullName(String displayFullName) {
                this.displayFullName = displayFullName;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public String getDisplayShortName() {
                return displayShortName;
            }

            public void setDisplayShortName(String displayShortName) {
                this.displayShortName = displayShortName;
            }

            public String getCompanyTypename() {
                return companyTypename;
            }

            public void setCompanyTypename(String companyTypename) {
                this.companyTypename = companyTypename;
            }

            public boolean isIsCompany() {
                return isCompany;
            }

            public void setIsCompany(boolean isCompany) {
                this.isCompany = isCompany;
            }

            public List<CompanyTagsBean> getCompanyTags() {
                return companyTags;
            }

            public void setCompanyTags(List<CompanyTagsBean> companyTags) {
                this.companyTags = companyTags;
            }

            public static class CompanyTagsBean {
                private String tag_id;
                private String company_id;
                private String tag_category;
                private String tag_image_id;
                private String tag_image;
                private String tag_title;
                private String tag_desc;
                private String used_count;
                private String status;
                private String ctime;
                private String utime;
                private String tag_imagePreview;

                public String getTag_id() {
                    return tag_id;
                }

                public void setTag_id(String tag_id) {
                    this.tag_id = tag_id;
                }

                public String getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(String company_id) {
                    this.company_id = company_id;
                }

                public String getTag_category() {
                    return tag_category;
                }

                public void setTag_category(String tag_category) {
                    this.tag_category = tag_category;
                }

                public String getTag_image_id() {
                    return tag_image_id;
                }

                public void setTag_image_id(String tag_image_id) {
                    this.tag_image_id = tag_image_id;
                }

                public String getTag_image() {
                    return tag_image;
                }

                public void setTag_image(String tag_image) {
                    this.tag_image = tag_image;
                }

                public String getTag_title() {
                    return tag_title;
                }

                public void setTag_title(String tag_title) {
                    this.tag_title = tag_title;
                }

                public String getTag_desc() {
                    return tag_desc;
                }

                public void setTag_desc(String tag_desc) {
                    this.tag_desc = tag_desc;
                }

                public String getUsed_count() {
                    return used_count;
                }

                public void setUsed_count(String used_count) {
                    this.used_count = used_count;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public String getUtime() {
                    return utime;
                }

                public void setUtime(String utime) {
                    this.utime = utime;
                }

                public String getTag_imagePreview() {
                    return tag_imagePreview;
                }

                public void setTag_imagePreview(String tag_imagePreview) {
                    this.tag_imagePreview = tag_imagePreview;
                }
            }
        }
    }

