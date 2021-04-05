package com.toolq.qq.protocol.protobuf.oidb;

import com.qq.pb.*;

public final class cmd0x352 {
    public static final class ReqBody extends MessageMicro<ReqBody> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18, 26, 34, 80}, new String[]{"uint32_subcmd", "rpt_msg_tryup_img_req", "rpt_msg_getimg_url_req", "rpt_msg_del_img_req", "uint32_net_type"}, new Object[]{0, null, null, null, 0}, ReqBody.class);
        public final PBRepeatMessageField<cmd0x352.DelImgReq> rpt_msg_del_img_req = PBField.initRepeatMessage(cmd0x352.DelImgReq.class);
        public final PBRepeatMessageField<cmd0x352.GetImgUrlReq> rpt_msg_getimg_url_req = PBField.initRepeatMessage(cmd0x352.GetImgUrlReq.class);
        public final PBRepeatMessageField<TryUpImgReq> rpt_msg_tryup_img_req = PBField.initRepeatMessage(cmd0x352.TryUpImgReq.class);
        public final PBUInt32Field uint32_net_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_subcmd = PBField.initUInt32(0);
    }

    public static final class RspBody extends MessageMicro<RspBody> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18, 26, 32, 42, 82}, new String[]{"uint32_subcmd", "rpt_msg_tryup_img_rsp", "rpt_msg_getimg_url_rsp", "bool_new_bigchan", "rpt_msg_del_img_rsp", "bytes_fail_msg"}, new Object[]{0, null, null, false, null, ByteStringMicro.EMPTY}, RspBody.class);
        public final PBBoolField bool_new_bigchan = PBField.initBool(false);
        public final PBBytesField bytes_fail_msg = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBRepeatMessageField<cmd0x352.DelImgRsp> rpt_msg_del_img_rsp = PBField.initRepeatMessage(cmd0x352.DelImgRsp.class);
        public final PBRepeatMessageField<cmd0x352.GetImgUrlRsp> rpt_msg_getimg_url_rsp = PBField.initRepeatMessage(cmd0x352.GetImgUrlRsp.class);
        public final PBRepeatMessageField<cmd0x352.TryUpImgRsp> rpt_msg_tryup_img_rsp = PBField.initRepeatMessage(cmd0x352.TryUpImgRsp.class);
        public final PBUInt32Field uint32_subcmd = PBField.initUInt32(0);
    }

    public static final class TryUpImgRsp extends MessageMicro<TryUpImgRsp> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 24, 34, 40, 50, 56, 64, 74, 82, 90, 96, 104, 114, 120, 210, 218, 482, 490, 498, 514, 522, 528, 8010}, new String[]{"uint64_file_id", "uint32_client_ip", "uint32_result", "bytes_fail_msg", "bool_file_exit", "msg_img_info", "rpt_uint32_up_ip", "rpt_uint32_up_port", "bytes_up_ukey", "bytes_up_resid", "bytes_up_uuid", "uint64_up_offset", "uint64_block_size", "bytes_encrypt_dstip", "uint32_roamdays", "rpt_msg_up_ip6", "bytes_client_ip6", "bytes_thumb_down_para", "bytes_original_down_para", "bytes_down_domain", "bytes_big_down_para", "bytes_big_thumb_down_para", "uint32_https_url_flag", "msg_info4busi"}, new Object[]{0L, 0, 0, ByteStringMicro.EMPTY, false, null, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0L, 0L, ByteStringMicro.EMPTY, 0, null, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, null}, TryUpImgRsp.class);
        public final PBBoolField bool_file_exit = PBField.initBool(false);
        public final PBBytesField bytes_big_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_big_thumb_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_client_ip6 = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_down_domain = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_encrypt_dstip = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_fail_msg = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_original_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_thumb_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_up_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_up_ukey = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_up_uuid = PBField.initBytes(ByteStringMicro.EMPTY);
        public cmd0x352.ImgInfo msg_img_info = new cmd0x352.ImgInfo();
        public cmd0x352.TryUpInfo4Busi msg_info4busi = new cmd0x352.TryUpInfo4Busi();
        public final PBRepeatMessageField<cmd0x352.IPv6Info> rpt_msg_up_ip6 = PBField.initRepeatMessage(cmd0x352.IPv6Info.class);

        public final PBRepeatField<Long> rpt_uint32_up_ip = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
        public final PBRepeatField<Integer> rpt_uint32_up_port = PBField.initRepeat(PBUInt32Field.__repeatHelper__);

        public final PBUInt32Field uint32_client_ip = PBField.initUInt32(0);
        public final PBUInt32Field uint32_https_url_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_result = PBField.initUInt32(0);
        public final PBUInt32Field uint32_roamdays = PBField.initUInt32(0);
        public final PBUInt64Field uint64_block_size = PBField.initUInt64(0);
        public final PBUInt64Field uint64_file_id = PBField.initUInt64(0);
        public final PBUInt64Field uint64_up_offset = PBField.initUInt64(0);
    }

    public static final class TryUpInfo4Busi extends MessageMicro<TryUpInfo4Busi> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18, 26, 34, 42}, new String[]{"bytes_file_resid", "bytes_down_domain", "bytes_thumb_down_url", "bytes_original_down_url", "bytes_big_down_url"}, new Object[]{ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY}, TryUpInfo4Busi.class);
        public final PBBytesField bytes_big_down_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_down_domain = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_original_down_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_thumb_down_url = PBField.initBytes(ByteStringMicro.EMPTY);
    }

    public static final class GetImgUrlRsp extends MessageMicro<GetImgUrlRsp> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 16, 24, 34, 42, 50, 58, 64, 72, 82, 90, 98, 106, 114, 122, 128, 210, 218}, new String[]{"bytes_file_resid", "uint32_client_ip", "uint32_result", "bytes_fail_msg", "rpt_bytes_thumb_down_url", "rpt_bytes_original_down_url", "msg_img_info", "rpt_uint32_down_ip", "rpt_uint32_down_port", "bytes_thumb_down_para", "bytes_original_down_para", "bytes_down_domain", "rpt_bytes_big_down_url", "bytes_big_down_para", "bytes_big_thumb_down_para", "uint32_https_url_flag", "rpt_msg_down_ip6", "bytes_client_ip6"}, new Object[]{ByteStringMicro.EMPTY, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, null, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, null, ByteStringMicro.EMPTY}, GetImgUrlRsp.class);
        public final PBBytesField bytes_big_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_big_thumb_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_client_ip6 = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_down_domain = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_fail_msg = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_original_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_thumb_down_para = PBField.initBytes(ByteStringMicro.EMPTY);
        public cmd0x352.ImgInfo msg_img_info = new cmd0x352.ImgInfo();
        public final PBRepeatField<ByteStringMicro> rpt_bytes_big_down_url = PBField.initRepeat(PBBytesField.__repeatHelper__);
        public final PBRepeatField<ByteStringMicro> rpt_bytes_original_down_url = PBField.initRepeat(PBBytesField.__repeatHelper__);
        public final PBRepeatField<ByteStringMicro> rpt_bytes_thumb_down_url = PBField.initRepeat(PBBytesField.__repeatHelper__);
        public final PBRepeatMessageField<cmd0x352.IPv6Info> rpt_msg_down_ip6 = PBField.initRepeatMessage(cmd0x352.IPv6Info.class);
        public final PBRepeatField<Integer> rpt_uint32_down_ip = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
        public final PBRepeatField<Integer> rpt_uint32_down_port = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
        public final PBUInt32Field uint32_client_ip = PBField.initUInt32(0);
        public final PBUInt32Field uint32_https_url_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_result = PBField.initUInt32(0);
    }

    public static final class IPv6Info extends MessageMicro<IPv6Info> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 16}, new String[]{"bytes_ip6", "uint32_port"}, new Object[]{ByteStringMicro.EMPTY, 0}, IPv6Info.class);
        public final PBBytesField bytes_ip6 = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_port = PBField.initUInt32(0);
    }

    public static final class ImgInfo extends MessageMicro<ImgInfo> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 16, 24, 32, 40, 48, 56}, new String[]{"bytes_file_md5", "uint32_file_type", "uint64_file_size", "uint32_file_width", "uint32_file_height", "uint64_file_flag", "uint32_file_cut_pos"}, new Object[]{ByteStringMicro.EMPTY, 0, 0L, 0, 0, 0L, 0}, ImgInfo.class);
        public final PBBytesField bytes_file_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_file_cut_pos = PBField.initUInt32(0);
        public final PBUInt32Field uint32_file_height = PBField.initUInt32(0);
        public final PBUInt32Field uint32_file_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_file_width = PBField.initUInt32(0);
        public final PBUInt64Field uint64_file_flag = PBField.initUInt64(0);
        public final PBUInt64Field uint64_file_size = PBField.initUInt64(0);
    }

    public static final class DelImgRsp extends MessageMicro<DelImgRsp> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18, 26}, new String[]{"uint32_result", "bytes_fail_msg", "bytes_file_resid"}, new Object[]{0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY}, DelImgRsp.class);
        public final PBBytesField bytes_fail_msg = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_result = PBField.initUInt32(0);
    }

    public static final class DelImgReq extends MessageMicro<DelImgReq> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 24, 32, 40, 50, 58, 64, 72}, new String[]{"uint64_src_uin", "uint64_dst_uin", "uint32_req_term", "uint32_req_platform_type", "uint32_bu_type", "bytes_build_ver", "bytes_file_resid", "uint32_pic_width", "uint32_pic_height"}, new Object[]{0L, 0L, 0, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, 0}, DelImgReq.class);
        public final PBBytesField bytes_build_ver = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_bu_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_height = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_width = PBField.initUInt32(0);
        public final PBUInt32Field uint32_req_platform_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_req_term = PBField.initUInt32(0);
        public final PBUInt64Field uint64_dst_uin = PBField.initUInt64(0);
        public final PBUInt64Field uint64_src_uin = PBField.initUInt64(0);
    }

    public static final class GetImgUrlReq extends MessageMicro<GetImgUrlReq> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 26, 32, 48, 56, 64, 72, 80, 88, 96, 106, 112, 120}, new String[]{"uint64_src_uin", "uint64_dst_uin", "bytes_file_resid", "uint32_url_flag", "uint32_url_type", "uint32_req_term", "uint32_req_platform_type", "uint32_src_file_type", "uint32_inner_ip", "bool_address_book", "uint32_bu_type", "bytes_build_ver", "uint32_pic_up_timestamp", "uint32_req_transfer_type"}, new Object[]{0L, 0L, ByteStringMicro.EMPTY, 0, 0, 0, 0, 0, 0, false, 0, ByteStringMicro.EMPTY, 0, 0}, GetImgUrlReq.class);
        public final PBBoolField bool_address_book = PBField.initBool(false);
        public final PBBytesField bytes_build_ver = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_resid = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_bu_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_inner_ip = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_up_timestamp = PBField.initUInt32(0);
        public final PBUInt32Field uint32_req_platform_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_req_term = PBField.initUInt32(0);
        public final PBUInt32Field uint32_req_transfer_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_src_file_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_url_flag = PBField.initUInt32(0);
        public final PBUInt32Field uint32_url_type = PBField.initUInt32(0);
        public final PBUInt64Field uint64_dst_uin = PBField.initUInt64(0);
        public final PBUInt64Field uint64_src_uin = PBField.initUInt64(0);
    }

    public static final class TryUpImgReq extends MessageMicro<TryUpImgReq> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(
                new int[]{8, 16, 24, 34, 40, 50, 56, 64, 72, 80, 88, 96, 104, 112, 120, 128, 138, 146, 152, 160, 168, 176, 186},
                new String[]{"uint64_src_uin",
                        "uint64_dst_uin",
                        "uint64_file_id",
                        "bytes_file_md5",
                        "uint64_file_size",
                        "bytes_file_name",
                        "uint32_src_term",
                        "uint32_platform_type",
                        "uint32_inner_ip",
                        "bool_address_book",
                        "uint32_retry",
                        "uint32_bu_type",
                        "bool_pic_original",
                        "uint32_pic_width",
                        "uint32_pic_height",
                        "uint32_pic_type",
                        "bytes_build_ver",
                        "bytes_file_index",
                        "uint32_store_days",
                        "uint32_tryup_stepflag",
                        "bool_reject_tryfast", "uint32_srv_upload", "bytes_transfer_url"},
                new Object[]{0L, 0L, 0L, ByteStringMicro.EMPTY, 0L, ByteStringMicro.EMPTY, 0, 0, 0, false, 0, 0, false, 0, 0, 0, ByteStringMicro.EMPTY, ByteStringMicro.EMPTY, 0, 0, false, 0, ByteStringMicro.EMPTY},
                TryUpImgReq.class);

        public final PBUInt64Field uint64_src_uin = PBField.initUInt64(0);
        public final PBUInt64Field uint64_dst_uin = PBField.initUInt64(0);
        public final PBUInt64Field uint64_file_id = PBField.initUInt64(0);
        public final PBBytesField bytes_file_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt64Field uint64_file_size = PBField.initUInt64(0);
        public final PBBytesField bytes_file_name = PBField.initBytes(ByteStringMicro.EMPTY);

        public final PBBoolField bool_address_book = PBField.initBool(false);
        /**
         * 是否是图片原图
         */
        public final PBBoolField bool_pic_original = PBField.initBool(false);
        public final PBBoolField bool_reject_tryfast = PBField.initBool(false);
        public final PBBytesField bytes_build_ver = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_file_index = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBBytesField bytes_transfer_url = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBUInt32Field uint32_bu_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_inner_ip = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_height = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_pic_width = PBField.initUInt32(0);
        public final PBUInt32Field uint32_platform_type = PBField.initUInt32(0);
        public final PBUInt32Field uint32_retry = PBField.initUInt32(0);
        public final PBUInt32Field uint32_src_term = PBField.initUInt32(0);
        public final PBUInt32Field uint32_srv_upload = PBField.initUInt32(0);
        public final PBUInt32Field uint32_store_days = PBField.initUInt32(0);
        public final PBUInt32Field uint32_tryup_stepflag = PBField.initUInt32(0);
    }
}
