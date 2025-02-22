package br.com.nlw.events.repository;

import br.com.nlw.events.dto.SubscriptionRankingItem;
import br.com.nlw.events.model.Event;
import br.com.nlw.events.model.Subscription;
import br.com.nlw.events.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubscriptionRepo extends CrudRepository<Subscription, Integer> {
    Subscription findByEventAndSubscriber(Event event, User subscriber);

    @Query(value = "SELECT " +
            "    COUNT(subscription_number) AS quantidade, " +
            "    tbl_subscription.indication_user_id, " +
            "    tbl_user.user_name" +
            " FROM tbl_subscription" +
            " INNER JOIN tbl_user" +
            "    ON tbl_subscription.indication_user_id = tbl_user.user_id " +
            " WHERE tbl_subscription.indication_user_id IS NOT NULL " +
            "    AND tbl_subscription.event_id = :eventId " +
            " GROUP BY tbl_subscription.indication_user_id, tbl_user.user_name " +
            " ORDER BY quantidade DESC ", nativeQuery = true)
    List<SubscriptionRankingItem> generateRanking(@Param("eventId") Integer eventId);
}
