package ace.captcha.base.api.web.controller;

import ace.captcha.base.api.CaptchaBaseApi;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/1/19 11:37
 * @description
 */

@RestController
@RequestMapping(path = "/" + CaptchaBaseApi.MODULE_RESTFUL_NAME)
@Validated
public interface CaptchaBaseController extends CaptchaBaseApi {

}
