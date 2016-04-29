package dao.bo.api;



import dao.shared.EntityVO;

import javax.persistence.*;

/**
 * Main Test Business Object.
 *
 * @author Andrew Khikevich
 */
@Entity
@Table(name = "FULL_DATA")
public class TestEntityBO implements EntityVO {

    /**
     * Generated SerialUID.
     */
    private static final long serialVersionUID = -6638705243838150986L;
    /**
     * String id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Rendering Engine name.
     */
    @Column()
    private String renderingEngine;

    /**
     * Browser name.
     */
    @Column()
    private String browser;

    /**
     * Platform name.
     */
    @Column()
    private String platform;

    /**
     * Engine version.
     */
    @Column()
    private String engineVersion;

    /**
     * CSS grade.
     */
    @Column()
    private String cssGrade;

    public int getId() {
        return id;
    }

	public void setId(final int id) {this.id = id;}

    public String getRenderingEngine() {
        return renderingEngine;
    }

    public void setRenderingEngine(final String renderingEngine) {
        this.renderingEngine = renderingEngine;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(final String browser) {
        this.browser = browser;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(final String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getCssGrade() {
        return cssGrade;
    }

    public void setCssGrade(final String cssGrade) {
        this.cssGrade = cssGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntityBO that = (TestEntityBO) o;

        if (browser != null ? !browser.equals(that.browser) : that.browser != null)
            return false;
        if (cssGrade != null ? !cssGrade.equals(that.cssGrade) : that.cssGrade != null)
            return false;
        if (engineVersion != null ? !engineVersion.equals(that.engineVersion) : that.engineVersion != null)
            return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null)
            return false;
        if (renderingEngine != null ? !renderingEngine.equals(that.renderingEngine) : that.renderingEngine != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = renderingEngine != null ? renderingEngine.hashCode() : 0;
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (engineVersion != null ? engineVersion.hashCode() : 0);
        result = 31 * result + (cssGrade != null ? cssGrade.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("RenderingEngine=").append(renderingEngine);
        sb.append("Browser=").append(browser);
        sb.append("Platform=").append(platform);
        sb.append("Engine Version=").append(engineVersion);
        sb.append("CSS grade:=").append(cssGrade);
        return sb.toString();
    }
}
