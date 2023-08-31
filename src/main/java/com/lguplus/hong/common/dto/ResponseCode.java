package com.lguplus.hong.common.dto;

/**
 * 실패 원인을 리턴하기 위한 클래스 ( only for 프론트 개발자, message 가 그대로 사용자에게 노출되면 안됨. )
 */
public enum ResponseCode {

    // 정상
    OK(0, "성공"),
    BAD_REQUEST(400, "BAD REQUEST"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    SERVER_ERROR(500, "SERVER ERROR"),

    // 인증 1000 부터
    // 1000
    NOT_SUPPORTED_AUTH_PROVIDER(1001, "지원하지 않는 인증 프로바이더"),
    // 1100 - sign in/up
    SIGN_IN_FAIL_WRONG_ID_OR_PASSWORD(1101, "ID 또는 비밀번호 오류"),

    // 9999 알수없는 에러.
    UNKNOWN_RESPONSE(9999, "알수없는 에러 응답코드");


    int code;
    String message;

    // PROD 에선 message 가 ""로 대체됨.
    boolean prodProfile;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    /**
     * Prod 에선 ""로 대체되고, 그 외의 프로필에선 [DEV] 가 붙음.
     *
     * @return
     */
    public String getMessage() {
        return prodProfile ? "" : "[DEV] " + message;
    }


    void setProdProfile(boolean prodProfile) {
        this.prodProfile = prodProfile;
    }

    public boolean equalsCode(int code) {
        return getCode() == code;
    }

    public static ResponseCode valueOf(int code) {
        for (var responseCode : ResponseCode.values()) {
            if (responseCode.getCode() == code) {
                return responseCode;
            }
        }
        return ResponseCode.UNKNOWN_RESPONSE;
    }
}
