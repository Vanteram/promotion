package yike.example.service.rule;

import yike.example.constants.PromotionConstants;
import yike.example.service.IPromotionRuleService;

public class BasePostFeeRuleService implements IPromotionRuleService {

	@Override
	public String promotionRuleType() {
		return PromotionConstants.PROMOTION_RULE_TYPE_FREE_POSTFEE + "_";
	}

}
