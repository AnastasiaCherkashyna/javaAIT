package testLessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class LocalDateClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalDateClass.class);
    public static void main(String[] args) {
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info("Now is " + localDateNow);
        LocalDate localDateBirth = LocalDate.of(1989, 03, 28);
        LOGGER.info("Date of Birth " + localDateBirth);

        Period period = Period.between(localDateNow, localDateBirth);
        LOGGER.info("Period is " + period);

        System.out.println("-------4-------");
        LocalDateTime localDateTimeToParse = LocalDateTime.parse("2024-12-31T23:59");
        LOGGER.info("Date to Parse " + localDateTimeToParse);
        String formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(localDateTimeToParse);
        LOGGER.info("Formated " + formatted);

        // преобразуем текущю дату нашего часового пояса в формат, прописанный в скобках (кастомный)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        String customFormatted = customFormatter.format(ZonedDateTime.now());
        LOGGER.info("What is it " + customFormatted);

        System.out.println("-------5-------");
        LocalDate localNow = LocalDate.now();
        LOGGER.info("Now is " + localNow);
        LocalDate localNewYear = LocalDate.of(2025,01,01);
        Period period1 = Period.between(localNow, localNewYear);
        LOGGER.info("to New Year " + period1);

        System.out.println("-------Task05------------");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeNewYear = LocalDateTime.of(2025, 1, 1, 0, 0);
        long daysUntilTheNewYear = localDateTimeNow.until(localDateTimeNewYear, ChronoUnit.DAYS);
        LOGGER.info("Days left until the new year: " + daysUntilTheNewYear);

        System.out.println("-------Task06------------");
        LocalDate nextBirthday = LocalDate.of(2025, 03,28);
        LOGGER.info("Next day of birth is " + nextBirthday.getDayOfWeek());

        System.out.println("-------Task07------------");
        ZonedDateTime now = ZonedDateTime.now();
        LOGGER.info("now is " + now);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTimeTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        LOGGER.info("Tokyo " + zonedDateTimeTokyo);

        System.out.println("-------Task08------------");

        YearMonth yearMonth = YearMonth.of(2024, Month.APRIL);
        System.out.println(yearMonth);
        Year year = Year.of(2024);
        Year year1 = Year.of(19000050);
        System.out.println(year);
        System.out.println("------------------------");

        LocalDateTime localDateTimeToParse1 = LocalDateTime.parse("2024-02-02T12:30:23");
        System.out.println(localDateTimeToParse);

        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN).format(LocalDate.of(2024, 04, 01));
        String format1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.GERMAN).format(LocalDate.of(2024, 04, 01));
        System.out.println(format);

        LocalDate startLocalDate = LocalDate.parse("2024-02-02");
        LocalDate endLocalDate = LocalDate.parse("2024-12-02");
        long until = startLocalDate.until(endLocalDate, ChronoUnit.MONTHS);
        long until1 = startLocalDate.until(endLocalDate, ChronoUnit.WEEKS);
        System.out.println(until);
        System.out.println(until1);

    }
}
