package yike.example.service.condition;

import java.util.List;

import org.springframework.stereotype.Service;

import yike.bo.PromotionRuleBO;
import yike.dto.CartCustomerDTO;
import yike.dto.CartStockDTO;
import yike.example.constants.PromotionRuleConstants;

/**
 * 特价
 * @author Administrator
 *
 */
@Service
public class SpecialOtherConditionService implements IPromotionRuleOtherService {

	@Override
	public Boolean filterByOtherRule(PromotionRuleBO promotionRule, CartCustomerDTO cartCustomerContext, List<CartStockDTO> promotionContext) {
		return null;
	}

	@Override
	public Long lockStock(PromotionRuleBO promotionRule, CartCustomerDTO cartCustomerContext, List<CartStockDTO> promotionContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean useStock(Long orderId, Long promotionStockId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Byte promotionRuleType() {
		return PromotionRuleConstants.PROMOTION_RULE_TYPE_SPECIAL;
	}

}